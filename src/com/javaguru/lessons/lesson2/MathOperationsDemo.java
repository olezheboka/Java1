package com.javaguru.lessons.lesson2;

class MathOperationsDemo {

    public static void main(String[] args) {
        int firstNumber = 99;
        int secondNumber = 13;

        int sumResult = firstNumber + secondNumber;
        System.out.println("Addition result of two numbers is " + sumResult);

        int subtractResult = firstNumber - secondNumber;
        System.out.println("Subtraction result of two numbers is " + subtractResult);

        int multiplyResult = firstNumber * secondNumber;
        System.out.println("Multiplication result of two numbers is " + multiplyResult);

        double divideResult = firstNumber / (double) secondNumber;
        System.out.println("Division result of two numbers is = " + divideResult);
    }
}
