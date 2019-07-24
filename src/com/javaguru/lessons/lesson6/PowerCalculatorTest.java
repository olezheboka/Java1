package com.javaguru.lessons.lesson6;

public class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest testRunner = new PowerCalculatorTest();
        testRunner.ShouldCheckCalcPower();
    }

    void ShouldCheckCalcPower() {
        PowerCalculator target = new PowerCalculator();
        String testName = "Checking Power Calculation";

        int expectedResult = 1000;
        int actualResult = target.calcPower(10, 3);

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
