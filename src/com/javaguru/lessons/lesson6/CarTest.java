package com.javaguru.lessons.lesson6;

public class CarTest {

    public static void main(String[] args) {
        CarTest testRunner = new CarTest();
        testRunner.shouldCheckAccelerate();
        testRunner.shouldCheckDecelerate();
    }

    void shouldCheckAccelerate() {
        Car target = new Car("BMW", "blue", 300);
        target.accelerate(50);

        String testName = "Checking acceleration";
        int expectedResult = 50;
        int actualResult = target.getCurrentSpeed();

        printCheckResult(expectedResult, actualResult, testName);

    }

    void shouldCheckDecelerate() {
        Car target = new Car("BMW", "blue", 300);
        target.accelerate(50);
        target.decelerate(30);

        String testName = "Checking deceleration";
        int expectedResult = 30;
        int actualResult = target.getCurrentSpeed();

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
