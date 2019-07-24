package com.javaguru.lessons.lesson6;

public class ContinueExample {

    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            if (i >= 50 && i <= 70) {
                continue;
            }
            System.out.println(i);
        }
    }
}
