package com.javaguru.lessons.lesson7;

import java.util.Arrays;

public class LookUpArrayServiceDemo {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        LookUpArrayService arrayService = new LookUpArrayService();

        System.out.println(Arrays.toString(array));

        int max = arrayService.findMax(array);
        System.out.println("Maximum value = " + max);

        int indexOfMax = arrayService.indexOfMax(array);
        System.out.println("Index of max value = " + indexOfMax);

        int min = arrayService.findMin(array);
        System.out.println("Minimum value = " + min);

        int indexOfMin = arrayService.indexOfMin(array);
        System.out.println("Index of min value = " + indexOfMin);

        int indexOfValue = arrayService.indexOf(array, 3);
        System.out.println("Index of 3 = " + indexOfValue);

    }
}
