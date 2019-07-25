package com.javaguru.lessons.lesson8.MathOperations;

public class OperationExecutor {


    void execute(MathOperation[] operations, double a, double b) {

        for (MathOperation operation : operations) {
            System.out.println(operation.compute(a, b));

        }
    }
}
