package com.javaguru.lessons.lesson7;

import java.util.Random;

public class ArrayService {

    public int[] create(int size) {
        return new int[size];
    }

    public void fillRandomly(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }


    public void printArray(int[] array) {
        for (int value : array) {
            System.out.print("[" + value + "] ");
        }
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public double avg(int[] array) {

        double average = 0;

        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        average /= array.length;
        return average;
    }

    public void sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int lower = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = lower;
                }
            }
        }
    }

    public void swap(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temporary = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temporary;
        }
    }


}
