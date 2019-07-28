package com.javaguru.lessons.lesson7;

import java.util.Arrays;

public class Palindrome {

    boolean isPalindrome(String text) {

        text = text.replaceAll("[^a-zA-Z0-9]", "");
        text = text.toLowerCase();

        char[] myArray = text.toCharArray();
        int size = myArray.length;
        char[] copy = Arrays.copyOf(myArray, myArray.length);

        for (int i = 0; i < size / 2; i++) {
            char temp = myArray[i];
            myArray[i] = myArray[size - i - 1];
            myArray[size - i - 1] = temp;
        }

        System.out.println("Original " + Arrays.toString(copy));
        System.out.println("Reverse " + Arrays.toString(myArray));

        if (Arrays.equals(myArray, copy)) {
            System.out.println("String is palindrome");
            return true;
        } else {
            System.out.println("String is not a palindrome");
            return false;
        }
    }
}
