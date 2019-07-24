package com.javaguru.lessons.lesson6;

public class DoWhileLoopChecker {

    public static void main(String[] args) {
        int i = 0;
        do {
            if (i % 2 != 0) {
                System.out.print("i = " + i + "; ");
            }
            i++;
        } while (i <= 50);
    }
}
