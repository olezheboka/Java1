package com.javaguru.lessons.lesson8.MathOperations;

public class DivisionOperation implements MathOperation {

    @Override
    public double compute(double a, double b) {
        System.out.print("The result of division is: ");
        return a / b;
    }
}
