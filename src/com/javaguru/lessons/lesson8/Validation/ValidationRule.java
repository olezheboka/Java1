package com.javaguru.lessons.lesson8.Validation;

public interface ValidationRule {

    boolean validate(String str);

    default boolean checkNotNull(String str) {
        if (str == null) {
            return false;
        }
        return true;
    }
}
