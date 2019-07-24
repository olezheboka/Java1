package com.javaguru.lessons.lesson4;

import com.javaguru.lessons.lesson3.Human;

public class HumanAgeClassifierTest {

    public static void main(String[] args) {
        HumanAgeClassifierTest testRunner = new HumanAgeClassifierTest();
        testRunner.shouldClassifyBaby();
        testRunner.shouldClassifyIncorrectData();
        testRunner.shouldClassifyBaby0Years();
    }

    void shouldClassifyBaby() {
        HumanAgeClassifier victim = new HumanAgeClassifier();

        String testName = "shouldClassifyBaby";
        int age = 3;
        String expectedResult = "baby";
        String actualResult = victim.classify(age);

        printCheckResult(expectedResult, actualResult, testName);
    }

    void shouldClassifyBaby0Years() {
        HumanAgeClassifier victim = new HumanAgeClassifier();

        String testName = "shouldClassifyBaby0Years";
        int age = 0;
        String expectedResult = "baby";
        String actualResult = victim.classify(age);

        printCheckResult(expectedResult, actualResult, testName);
    }

    void shouldClassifyIncorrectData() {
        HumanAgeClassifier victim = new HumanAgeClassifier();

        String testName = "shouldClassifyIncorrectData";
        int age = -1;
        String expectedResult = "Incorrect data";
        String actualResult = victim.classify(age);

        printCheckResult(expectedResult, actualResult, testName);

    }

    void printCheckResult(String actualResult, String expectedResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldClassifyIncorrectData has passed");
        } else {
            System.out.println("shouldClassifyIncorrectData has failed");
            System.out.println("Expect: " + expectedResult + "Actual: " + actualResult);
        }
    }
}
