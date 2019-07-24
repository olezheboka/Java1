package com.javaguru.lessons.lesson8.validation;

class MinLengthValidationRule implements ValidationRule {

    @Override
    public boolean validate(String str) {
        if (!checkNotNull(str)) {
            return false;
        }
        return str.length() >= 3;
    }
}
