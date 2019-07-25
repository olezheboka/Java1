package com.javaguru.lessons.lesson8.Validation;

class ValidationService {

    private ValidationRule[] validationRules;

    public ValidationService(ValidationRule[] validationRules) {
        this.validationRules = validationRules;
    }

    boolean validateString(String str) {
        for (ValidationRule rule : validationRules) {
            if (!rule.validate(str)) {
                return false;
            }
        }
        return true;
    }
}
