package com.javaguru.lessons.lessson9.homework.level4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopDemo {

    public static void main(String[] args) {


        Product productOne = new Product("Apple", new BigDecimal("1000.00"));
        Product productTwo = new Product("Samsung", new BigDecimal("500.00"));
        Product productThree = new Product("BMW", new BigDecimal("50000.00"));

        Shop shop = new Shop();

        shop.addProduct(productOne);
        shop.addProduct(productTwo);
        shop.addProduct(productThree);

        System.out.println(shop);

        shop.deleteProduct(productTwo);

        System.out.println(shop);

        Product productsFoundByName = shop.findProductByName("Apple");
        System.out.println(productsFoundByName);

        List<Product> productsFoundInRange = shop.findProductInRange(new BigDecimal("300.00"), new BigDecimal("76500.00"));
        System.out.println(productsFoundInRange);

    }


}
