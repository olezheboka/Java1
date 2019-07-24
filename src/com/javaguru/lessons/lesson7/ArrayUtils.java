package com.javaguru.lessons.lesson7;

public class ArrayUtils {

    static int sum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] =" + array[i] + " ");
        }
    }
}
