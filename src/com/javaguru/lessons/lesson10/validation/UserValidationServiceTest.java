package com.javaguru.lessons.lesson10.validation;

public class UserValidationServiceTest {

    public static void main(String[] args) {
        UserValidationServiceTest testRunner = new UserValidationServiceTest();
        testRunner.shouldThrowUserValidationException();
    }

    public void shouldThrowUserValidationException() {
        System.out.print("shouldThrowUserValidationException: ");
        UserValidationService service = new UserValidationService();
        User testUser = new User();

        try {
            service.validate(testUser);
            System.out.println("FAIL, expected UserValidationException");
        } catch (UserValidationException e) {
            if (e.getMessage().equals("User name must be not null"))
            System.out.println("SUCCESS");
            else {
                System.out.println("FAIL, expected message: User name must be not null., actual message: " + e.getMessage());
            }
        }

    }
}
