package com.javaguru.lessons.lesson7;

import java.util.Arrays;

public class CopyDemo {


    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        Copy copy = new Copy();

        copy.copyInRange(array, 2, 6);

    }

}

