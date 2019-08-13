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

    void findProductByName(String name) {
        for (Product product : shop) {

            String currentProductName = product.getName();
            if (currentProductName == name) {
                System.out.println(product);
            }
        }
    }

    void findProductInRange(BigDecimal minPriceRange, BigDecimal maxPriceRange) {
        for (Product product : shop) {
            BigDecimal currentProductPrice = product.getPrice();
            if (currentProductPrice.compareTo(minPriceRange) > 0 && currentProductPrice.compareTo(maxPriceRange) < 0) {
                System.out.println(product);
            }
        }
    }


    @Override
    public String toString() {
        return "Shop{" +
                "shop=" + shop +
                '}';
    }
}
