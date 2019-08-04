package com.javaguru.lessons.lesson7;

import java.util.Arrays;

public class Copy {


    int[] copyInRange(int[] in, int leftBound, int rightBound) {

        int newLength = 0;
        for (int value : in) {
            if (value >= leftBound && value <= rightBound) {
                newLength++;
            }
        }

        int[] copiedArray = new int[newLength];
        int index = 0;
        for (int value : in) {
            if (value >= leftBound && value <= rightBound) {
                copiedArray[index] = value;
                index++;
            }
        }

        System.out.println(Arrays.toString(copiedArray));
        return copiedArray;
    }

}

