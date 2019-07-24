package com.javaguru.lessons.lesson2;

import java.util.Random;

class RandomGeneratorDemo {

    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int firstRandomNumber = randomGenerator.nextInt(101);
        System.out.println("First number is " + firstRandomNumber);

        int secondRandomNumber = randomGenerator.nextInt(11);
        System.out.println("Second number is " + secondRandomNumber);

        int thirdRandomNumber = randomGenerator.nextInt(81) + 20;
        System.out.println("Third number is " + thirdRandomNumber);

        int sumResult = firstRandomNumber + secondRandomNumber + thirdRandomNumber;
        System.out.println("Sum of three numbers is " + sumResult);
    }
}
