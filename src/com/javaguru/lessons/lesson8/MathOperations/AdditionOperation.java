package com.javaguru.lessons.lesson8.MathOperations;

public class AdditionOperation implements MathOperation {

    @Override
    public double compute(double a, double b) {
        System.out.print("The result of addition is: ");
        return a + b;
    }
}
