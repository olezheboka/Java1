package com.javaguru.lessons.lesson6;

public class WhileOddChecker {

    public static void main(String[] args) {
        int i = 0;
        while (i <= 50) {
            if (i % 2 != 0) {
                System.out.print("i = " + i + "; ");
            }
            i++;

        }
    }

}
