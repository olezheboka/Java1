package com.javaguru.lessons.lessson9.homework.level4;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Shop {

    List<Product> shop = new ArrayList<>();

    void addProduct(Product newProduct) {
        shop.add(newProduct);
    }

    void deleteProduct(Product productToDelete) {
        shop.remove(productToDelete);
    }

    Product findProductByName(String name) {
        for (Product product : shop) {

            String currentProductName = product.getName();
            if (currentProductName == name) {
                System.out.println("Product found by " + name + " is: " + product);
                return product;
            }
        }
        return null;
    }

    Product findProductInRange(BigDecimal minPriceRange, BigDecimal maxPriceRange) {

        Product foundProductInRange = shop.get(0);

        for (Product product : shop) {
            BigDecimal currentProductPrice = product.getPrice();
            if (currentProductPrice.compareTo(minPriceRange) > 0 && currentProductPrice.compareTo(maxPriceRange) < 0) {
                foundProductInRange = product;
                System.out.println("Product found in range from " + minPriceRange + " to: " + maxPriceRange + " is: " + product);
            }
        }
        return foundProductInRange;
    }


    @Override
    public String toString() {
        return "Shop{" +
                "shop=" + shop +
                '}';
    }
}
