package com.javaguru.lessons.lesson4;

public class UserLoginServiceTest {

    public static void main(String[] args) {

        UserLoginServiceTest testRunner = new UserLoginServiceTest();
        testRunner.shouldCheckSucessfulLogin();
        testRunner.shouldCheckUserBlock();

    }

    void shouldCheckSucessfulLogin() {
        UserLoginService testable = new UserLoginService();
        User testableUser = new User("user-login", "user-password");
        String testName = "Sucessful login test";
        String expectedResult = "user-password";
        String actualResult = testableUser.getPassword();

        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + expectedResult + "; Actual: " + actualResult);
        }
    }


    void shouldCheckUserBlock() {
        User testableUser = new User("user-login", "user-password");
        String testName = "User block test";
        boolean expectedResult = false;
        boolean actualResult = testableUser.isUserBlocked();
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + expectedResult + "; Actual: " + actualResult);
        }
    }


}
