package com.javaguru.lessons.lesson6;

public class NumberServiceTest {

    public static void main(String[] args) {
        NumberServiceTest testRunner = new NumberServiceTest();
        testRunner.shouldCheckRangeSumForward();
        testRunner.shouldCheckRangeSumBackward();
        testRunner.shouldCheckRangeEvenCountForward();
        testRunner.shouldCheckRangeEvenCountBackward();

    }

    void shouldCheckRangeSumForward() {
        NumberService target = new NumberService();

        String testName = "RangeSum forward";
        int expectedResult = 55;
        int actualResult = target.rangeSum(1, 10);

        printCheckResult(expectedResult, actualResult, testName);

    }

    void shouldCheckRangeSumBackward() {
        NumberService target = new NumberService();

        String testName = "RangeSum backward";
        int expectedResult = 55;
        int actualResult = target.rangeSum(10, 1);

        printCheckResult(expectedResult, actualResult, testName);

    }

    void shouldCheckRangeEvenCountForward() {
        NumberService target = new NumberService();

        String testName = "RangeEvenCount forward";
        int expectedResult = 5;
        int actualResult = target.rangeEvenCount(1, 10);

        printCheckResult(expectedResult, actualResult, testName);
    }


    void shouldCheckRangeEvenCountBackward() {
        NumberService target = new NumberService();

        String testName = "RangeEvenCount backward";
        int expectedResult = 5;
        int actualResult = target.rangeEvenCount(10, 1);

        printCheckResult(expectedResult, actualResult, testName);
    }

    void printCheckResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + expectedResult + "; Actual: " + actualResult);
        }
    }
}
