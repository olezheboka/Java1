package com.javaguru.lessons.lesson8.validation;

public class MaxLengthValidationRule implements ValidationRule {

    @Override
    public boolean validate(String str) {
        if (!checkNotNull(str)) {
            return false;
        }
        return str.length() <= 32;
    }
}
