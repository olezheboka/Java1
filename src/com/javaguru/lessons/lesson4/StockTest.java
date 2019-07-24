package com.javaguru.lessons.lesson4;

public class StockTest {

    public static void main(String[] args) {
        Stock google = new Stock("AMAZON", 10);
        google.printInformation();

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        google.printInformation();

        System.out.println();

        StockTest testRunner = new StockTest();
        testRunner.shouldCheckMaxPrice();
        testRunner.shouldCheckMinPrice();
        testRunner.shouldCheckCurrentPrice();


    }

    void shouldCheckMaxPrice() {

        Stock testable = new Stock("test company", 10);
        String testName = "Checking maximum stock price";

        testable.updatePrice(20);
        testable.updatePrice(900);
        testable.updatePrice(13);

        int expectedResult = 900;
        int actualResult = testable.maxStockPrice;

        printCheckResult(actualResult, expectedResult, testName);
    }

    void shouldCheckMinPrice() {

        Stock testable = new Stock("test company", 10);
        String testName = "Checking minimum stock price";

        testable.updatePrice(5);
        testable.updatePrice(75);
        testable.updatePrice(3);

        int expectedResult = 3;
        int actualResult = testable.minStockPrice;

        printCheckResult(actualResult, expectedResult, testName);
    }

    void shouldCheckCurrentPrice() {

        Stock testable = new Stock("test company", 10);
        String testName = "Checking current stock price";

        testable.updatePrice(11);
        testable.updatePrice(12);
        testable.updatePrice(13);

        int expectedResult = 13;
        int actualResult = testable.currentStockPrice;

        printCheckResult(actualResult, expectedResult, testName);
    }

    void printCheckResult(int actualResult, int expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + expectedResult + "; Actual: " + actualResult);
        }
    }


}
