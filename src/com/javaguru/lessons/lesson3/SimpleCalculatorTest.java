package com.javaguru.lessons.lesson3;

public class SimpleCalculatorTest {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        int sumResult = calculator.sum(20, 10);
        System.out.println("Sum result is " + sumResult);

        int multiplyResult = calculator.multiply(50, 70);
        System.out.println("Multiply result = " + multiplyResult);
    }
}
