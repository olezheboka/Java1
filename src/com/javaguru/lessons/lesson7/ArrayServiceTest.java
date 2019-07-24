package com.javaguru.lessons.lesson7;

import java.util.Arrays;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest testRunner = new ArrayServiceTest();
        testRunner.shouldCheckCreate();
        testRunner.shouldCheckSum();
        testRunner.shouldCheckAvg();
        testRunner.shouldCheckSort();
        testRunner.shouldCheckSwap();

    }

    void shouldCheckCreate() {
        String testName = "Array creation";
        ArrayService test = new ArrayService();
        int size = 10;
        int[] array = new int[size];
        test.create(size);

        int expectedResult = 10;
        int actualResult = array.length;

        printCheckResult(actualResult, expectedResult, testName);
    }

    void shouldCheckSum() {
        String testName = "Sum";
        ArrayService test = new ArrayService();
        int[] array = {1, 2, 3};

        int expectedResult = 6;
        int actualResult = test.sum(array);

        printCheckResult(actualResult, expectedResult, testName);
    }

    void shouldCheckAvg() {
        String testName = "Avg";
        ArrayService test = new ArrayService();
        int[] array = {1, 2, 3};

        double expectedResult = 2;
        double actualResult = test.avg(array);

        printAvgResult(actualResult, expectedResult, testName);
    }

    void shouldCheckSort() {
        String testName = "Ascending Sort";
        ArrayService test = new ArrayService();
        int[] array = {2, 7, 4};
        test.sort(array);

        String expectedResult = "[2, 4, 7]";
        String actualResult = Arrays.toString(array);

        printSortResult(actualResult, expectedResult, testName);
    }

    void shouldCheckSwap() {
        String testName = "Swap";
        ArrayService test = new ArrayService();
        int[] array = {1, 2, 3, 4};
        test.sort(array);
        test.swap(array);

        String expectedResult = "[4, 3, 2, 1]";
        String actualResult = Arrays.toString(array);

        printSortResult(actualResult, expectedResult, testName);
    }


    void printCheckResult(int actualResult, int expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
            System.out.println("Expected: " + expectedResult + "; Actual: " + actualResult);
        }
    }

    void printAvgResult(double actualResult, double expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
            System.out.println("Expected: " + expectedResult + "; Actual: " + actualResult);
        }
    }

    void printSortResult(String actualResult, String expectedResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
            System.out.println("Expected: " + expectedResult + "; Actual: " + actualResult);
        }
    }
}
