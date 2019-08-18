package com.javaguru.lessons.lesson10;

public class UncheckedExceptionTest {
    public static void main(String[] args) {
        shouldThrowRuntimeException();
    }

    public static void shouldThrowRuntimeException() {
        throw new RuntimeException("Unchecked exception");
    }
}
