package com.javaguru.lessons.lesson7;

import java.util.Arrays;

public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest testRunner = new PalindromeTest();
        testRunner.shouldCheckIsPalindrome();
    }

    void shouldCheckIsPalindrome() {
        Palindrome target = new Palindrome();
        String testName = "Is Palindrome";
        boolean expectedResult = true;
        boolean actualResult = target.isPalindrome("racecar");

        printCheckResult(expectedResult, actualResult, testName);
    }

    void printCheckResult(boolean actualResult, boolean expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
            System.out.println("Expect: " + expectedResult + "; Actual: " + actualResult);
        }
    }
}
