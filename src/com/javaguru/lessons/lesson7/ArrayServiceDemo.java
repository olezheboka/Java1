package com.javaguru.lessons.lesson7;

import java.util.Arrays;

public class ArrayServiceDemo {

    public static void main(String[] args) {
        int size = 10;

        int[] array = new int[size];
        ArrayService arrayService = new ArrayService();


        arrayService.create(size);
        arrayService.fillRandomly(array);
        arrayService.printArray(array);

        System.out.println();

        int sumResult = arrayService.sum(array);
        System.out.println("Sum of all numbers is: " + sumResult);

        double avg = arrayService.avg(array);
        System.out.println("Average value is: " + avg);

        arrayService.sort(array);
        System.out.println(Arrays.toString(array));

        arrayService.swap(array);
        System.out.println(Arrays.toString(array));
    }
}
