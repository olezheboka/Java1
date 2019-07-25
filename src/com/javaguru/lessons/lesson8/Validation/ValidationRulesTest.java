package com.javaguru.lessons.lesson8.Validation;

class ValidationRulesTest {

    public static void main(String[] args) {
        ValidationRule[] rules = {
                new MaxLengthValidationRule(),
                new MinLengthValidationRule()
        };

        ValidationService validationService = new ValidationService(rules);
        boolean result = validationService.validateString("Hello World!");
        System.out.println("Result = " + result);
    }
}