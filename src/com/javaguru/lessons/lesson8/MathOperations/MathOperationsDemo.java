package com.javaguru.lessons.lesson8.MathOperations;

public class MathOperationsDemo {

    public static void main(String[] args) {

        OperationExecutor executor = new OperationExecutor();

        MathOperation[] ops = {
                new AdditionOperation(),
                new SubtractionOperation(),
                new MultiplicationOperation(),
                new DivisionOperation()
        };

        executor.execute(ops, 10, 5);


    }
}
