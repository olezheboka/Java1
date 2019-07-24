package com.javaguru.lessons.lesson5;

public class TvTest {

    public static void main(String[] args) {
        TvTest testRunner = new TvTest();
        testRunner.shouldCheckIfNextChannelWorks();
        testRunner.shouldCheckIfPreviousChannelWorks();
        testRunner.shouldCheckIfIncreaseVolumeWorks();
        testRunner.shouldCheckIfDecreaseVolumeWorks();
        testRunner.shouldCheckIfTurnTvOnWorks();
        testRunner.shouldCheckIfTurnTvOffWorks();
        testRunner.shouldCheckOverrideToString();
        testRunner.shouldCheckEqualOverride();

    }

    void shouldCheckIfNextChannelWorks() {
        Tv testableTv = new Tv();
        testableTv.setCurrentChannel(10);
        testableTv.setCurrentVolume(30);
        testableTv.setTvIsOn(true);
        testableTv.setManufacturer("LG");
        testableTv.nextChannel();

        String testName = "Checking if it is possible to switch to next channel";
        int expectedResult = 11;
        int actualResult = testableTv.getCurrentChannel();

        printCheckResult(expectedResult, actualResult, testName);

    }

    void shouldCheckIfPreviousChannelWorks() {
        Tv testableTv = new Tv();
        testableTv.setCurrentChannel(10);
        testableTv.setCurrentVolume(30);
        testableTv.setTvIsOn(true);
        testableTv.setManufacturer("LG");
        testableTv.previousChannel();

        String testName = "Checking if it is possible to switch to previous channel";
        int expectedResult = 9;
        int actualResult = testableTv.getCurrentChannel();

        printCheckResult(expectedResult, actualResult, testName);

    }

    void shouldCheckIfIncreaseVolumeWorks() {
        Tv testableTv = new Tv();
        testableTv.setCurrentChannel(10);
        testableTv.setCurrentVolume(30);
        testableTv.setTvIsOn(true);
        testableTv.setManufacturer("LG");
        testableTv.increaseVolume();

        String testName = "Checking if it is possible to increase volume";
        int expectedResult = 31;
        int actualResult = testableTv.getCurrentVolume();

        printCheckResult(expectedResult, actualResult, testName);

    }

    void shouldCheckIfDecreaseVolumeWorks() {
        Tv testableTv = new Tv();
        testableTv.setCurrentChannel(10);
        testableTv.setCurrentVolume(30);
        testableTv.setTvIsOn(true);
        testableTv.setManufacturer("LG");
        testableTv.decreaseVolume();

        String testName = "Checking if it is possible to decrease volume";
        int expectedResult = 29;
        int actualResult = testableTv.getCurrentVolume();

        printCheckResult(expectedResult, actualResult, testName);

    }

    void shouldCheckIfTurnTvOnWorks() {
        Tv testableTv = new Tv();
        testableTv.setCurrentChannel(10);
        testableTv.setCurrentVolume(30);
        testableTv.setTvIsOn(false);
        testableTv.setManufacturer("LG");
        testableTv.turnTvOn();

        String testName = "Checking if it is possible to turn TV on";
        boolean expectedResult = true;
        boolean actualResult = testableTv.isTvIsOn();

        printTurnTvOnResult(expectedResult, actualResult, testName);

    }

    void shouldCheckIfTurnTvOffWorks() {
        Tv testableTv = new Tv();
        testableTv.setCurrentChannel(10);
        testableTv.setCurrentVolume(30);
        testableTv.setTvIsOn(true);
        testableTv.setManufacturer("LG");
        testableTv.turnTvOff();

        String testName = "Checking if it is possible to turn TV off";
        boolean expectedResult = false;
        boolean actualResult = testableTv.isTvIsOn();

        printTurnTvOnResult(expectedResult, actualResult, testName);

    }

    void shouldCheckOverrideToString() {
        Tv testableTv = new Tv();
        testableTv.setCurrentChannel(10);
        testableTv.setCurrentVolume(30);
        testableTv.setTvIsOn(true);
        testableTv.setManufacturer("LG");

        String testName = "Checking if Override To String works";
        String expectedResult = "Tv{currentChannel=10, currentVolume=30, manufacturer='LG', ifTvIsOn=true}";
        String actualRestul = testableTv.toString();

        printOverrideToStringResult(expectedResult, actualRestul, testName);

    }

    void shouldCheckEqualOverride() {
        Tv testableTv = new Tv();
        testableTv.setCurrentChannel(10);
        testableTv.setCurrentVolume(30);
        testableTv.setTvIsOn(true);
        testableTv.setManufacturer("LG");

        Tv testableTv2 = new Tv();
        testableTv2.setCurrentChannel(10);
        testableTv2.setCurrentVolume(30);
        testableTv2.setTvIsOn(true);
        testableTv2.setManufacturer("LG");

        String testName = "Checking if Equal Override works";
        boolean expectedResult = true;
        boolean actualResult = testableTv.equals(testableTv2);

        printEqualOverrideResult(expectedResult, actualResult, testName);


    }

    void printCheckResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + expectedResult + "; Actual: " + actualResult);
        }
    }

    void printTurnTvOnResult(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + expectedResult + "; Actual: " + actualResult);
        }
    }

    void printOverrideToStringResult(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + expectedResult + "; Actual: " + actualResult);
        }
    }

    void printEqualOverrideResult(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + expectedResult + "; Actual: " + actualResult);
        }
    }
}
