package com.javaguru.lessons.lesson8.MathOperations;

public class MultiplicationOperation implements MathOperation {

    @Override
    public double compute(double a, double b) {
        System.out.print("The result of multiplication is: ");
        return a * b;
    }
}
