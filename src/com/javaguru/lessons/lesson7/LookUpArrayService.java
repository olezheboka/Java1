package com.javaguru.lessons.lesson7;

public class LookUpArrayService {


    int findMax(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    int findMin(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;

    }

    int indexOfMax(int[] array) {
        if (array.length == 0) {
            return -1;
        }

        int max = array[0];
        int indexOfMax = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }

    int indexOfMin(int[] array) {
        if (array.length == 0) {
            return -1;
        }

        int min = array[0];
        int indexOfMin = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }

    int indexOf(int[] array, int value) {

        if (array.length == 0) {
            return -1;
        }

        int indexOfValue = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                indexOfValue = i;
            }
        }
        return indexOfValue;
    }
}
