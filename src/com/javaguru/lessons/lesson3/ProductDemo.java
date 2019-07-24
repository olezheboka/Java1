package com.javaguru.lessons.lesson3;

public class ProductDemo {

    public static void main(String[] args) {
        Product superProduct = new Product();
        superProduct.setName("Bread");
        superProduct.setDiscount(10);
        superProduct.setRegularPrice(2);
        superProduct.printInformation();

    }
}
