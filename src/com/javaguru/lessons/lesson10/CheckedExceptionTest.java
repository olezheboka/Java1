package com.javaguru.lessons.lesson10;

public class CheckedExceptionTest {

    public static void main(String[] args) {
        try {
            shouldThrowException();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("FINALLY");
        }
    }

    public static void shouldThrowException() throws Exception {
        throw new Exception("My test checked exception");
    }
}
