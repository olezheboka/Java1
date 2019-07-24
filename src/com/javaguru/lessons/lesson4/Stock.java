package com.javaguru.lessons.lesson4;

public class Stock {

    String companyName;
    int currentStockPrice;
    int maxStockPrice;
    int minStockPrice;

    public Stock(String companyName, int currentStockPrice) {
        this.companyName = companyName;
        this.currentStockPrice = currentStockPrice;
        minStockPrice = currentStockPrice;
        maxStockPrice = currentStockPrice;
    }

    public void printInformation() {
        System.out.println(
                "COMPANY = " + companyName + ", Current Price = " + currentStockPrice + ", Min Price = "
                        + minStockPrice + ", Max Price = " + maxStockPrice);
    }

    public void updatePrice(int newStockPrice) {
        currentStockPrice = newStockPrice;

        if (newStockPrice > maxStockPrice) {
            maxStockPrice = newStockPrice;
        }
        if (newStockPrice < minStockPrice) {
            minStockPrice = newStockPrice;
        }
    }


}
