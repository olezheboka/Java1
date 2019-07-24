package com.javaguru.lessons.lesson7;

public class SimpleArrayDemo {

    public static void main(String[] args) {
        String[] words = new String[5];

        words[0] = "Hello";
        words[1] = "Bye";
        words[2] = "Dog";
        words[3] = "Fine";
        words[4] = "Gunar";

        for (String word : words) {
            System.out.print(word + " ");
        }
    }

}
