package com.javaguru.lessons.lesson10.homeworks.level2;

public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(String wrongId) {
        super(wrongId);
    }
}
