package com.javaguru.lessons.lesson8.MathOperations;

public class SubtractionOperation implements MathOperation {

    @Override
    public double compute(double a, double b) {
        System.out.print("The result of subtraction is: ");
        return a - b;
    }
}
