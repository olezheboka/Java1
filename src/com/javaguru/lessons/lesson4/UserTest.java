package com.javaguru.lessons.lesson4;

public class UserTest {

    public static void main(String[] args) {
        UserTest testRunner = new UserTest();

        testRunner.shouldCheckDefaultNumberOfTries();
        testRunner.shouldCheckDecreaseAmountOfTries();

    }

    void shouldCheckDefaultNumberOfTries() {
        UserLoginService testable = new UserLoginService();
        User testableUser = new User("user-login", "user-password");
        String testName = "Default number of tries test";

        int expectedResult = testableUser.getNumberOfTries();
        int actualResult = 3;

        printCheckResult(actualResult, expectedResult, testName);
    }

    void shouldCheckDecreaseAmountOfTries() {
        UserLoginService testable = new UserLoginService();
        User testableUser = new User("user-login", "user-password");
        String testName = "Decrease amount of tries test";
        testableUser.decreaseNumberOfTries();
        int expectedResult = testableUser.getNumberOfTries();
        int actualResult = 2;

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
