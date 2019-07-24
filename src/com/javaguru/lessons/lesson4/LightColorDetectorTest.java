package com.javaguru.lessons.lesson4;

public class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest testRunner = new LightColorDetectorTest();
        testRunner.shouldDetectViolet();
        testRunner.shouldDetectBlue();
        testRunner.shouldDetectGreen();
        testRunner.shouldDetectYellow();
        testRunner.shouldDetectOrange();
        testRunner.shouldDetectRed();
        testRunner.shouldDetectInvisible();
    }

    void shouldDetectViolet() {
        LightColorDetector testable = new LightColorDetector();
        String testName = "shouldDetectViolet";
        int wavelength = 400;
        String expectedResult = "violet";
        String actualResult = testable.detect(wavelength);

        printCheckResult(expectedResult, actualResult, testName);
    }

    void shouldDetectBlue() {
        LightColorDetector testable = new LightColorDetector();
        String testName = "shouldDetectBlue";
        int wavelength = 470;
        String expectedResult = "blue";
        String actualResult = testable.detect(wavelength);

        printCheckResult(expectedResult, actualResult, testName);
    }

    void shouldDetectGreen() {
        LightColorDetector testable = new LightColorDetector();
        String testName = "shouldDetectGreen";
        int wavelength = 500;
        String expectedResult = "green";
        String actualResult = testable.detect(wavelength);

        printCheckResult(expectedResult, actualResult, testName);
    }

    void shouldDetectYellow() {
        LightColorDetector testable = new LightColorDetector();
        String testName = "shouldDetectYellow";
        int wavelength = 575;
        String expectedResult = "yellow";
        String actualResult = testable.detect(wavelength);

        printCheckResult(expectedResult, actualResult, testName);

    }

    void shouldDetectOrange() {
        LightColorDetector testable = new LightColorDetector();
        String testName = "shouldDetectOrange";
        int wavelength = 600;
        String expectedResult = "orange";
        String actualResult = testable.detect(wavelength);

        printCheckResult(expectedResult, actualResult, testName);

    }

    void shouldDetectRed() {
        LightColorDetector testable = new LightColorDetector();
        String testName = "shouldDetectRed";
        int wavelength = 700;
        String expectedResult = "red";
        String actualResult = testable.detect(wavelength);

        printCheckResult(expectedResult, actualResult, testName);

    }

    void shouldDetectInvisible() {
        LightColorDetector testable = new LightColorDetector();
        String testName = "shouldDetectInvisible";
        int wavelength = 1000;
        String expectedResult = "Invisible light";
        String actualResult = testable.detect(wavelength);

        printCheckResult(expectedResult, actualResult, testName);

    }

    void printCheckResult(String actualResult, String expectedResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + expectedResult + "; Actual: " + actualResult);
        }
    }
}
