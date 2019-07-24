package com.javaguru.lessons.lesson3;

public class Product {

    private String name;
    private double regularPrice;
    private double discount;

    public double actualPrice() {
        return regularPrice - (regularPrice * (discount / 100));
    }

    public void printInformation() {
        System.out.println("Product name is " + name + ". Product regular price = " + regularPrice
                + ". Product discount is " + discount + "%. Product price after discount is "
                + actualPrice());
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getRegularPrice() {
        return regularPrice;
    }


    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
