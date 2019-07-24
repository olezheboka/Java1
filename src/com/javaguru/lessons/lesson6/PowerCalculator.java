package com.javaguru.lessons.lesson6;

public class PowerCalculator {


    int calcPower(int number, int power) {
        int result = 1;

        if (number > 0 && power > 0) {
            for (int i = 0; i < power; i++) {
                result *= number;
            }
            System.out.println("Result is " + result);

        } else {
            System.out.println("Please use positive numbers");
        }
        return result;
    }


}
