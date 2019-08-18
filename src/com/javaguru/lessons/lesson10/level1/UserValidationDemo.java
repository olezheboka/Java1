package com.javaguru.lessons.lesson10.level1;

public class UserValidationDemo {

    public static void main(String[] args) {
        System.out.print("shouldThrowUserValidationException: ");
        UserValidationService service = new UserValidationService();
        User testUser = new User();
        testUser.setFirstName("Oleg");
        testUser.setLastName("Yaroshevich");
        testUser.setAge(30);

        try {
            service.validate(testUser);
            System.out.println("No exceptions");
        } catch (UserValidationException e) {
            if (e.getMessage().equals("Name too short")) {
                System.out.println("Name too short");
            }
            if (e.getMessage().equals("Name too long")) {
                System.out.println("Name too long");
            }
            if (e.getMessage().equals("Last name too short")) {
                System.out.println("Last name too short");
            }
            if (e.getMessage().equals("Last name too long")) {
                System.out.println("Last name too long");
            }
            if (e.getMessage().equals("Invalid age")) {
                System.out.println("Invalid age");
            }

        }
    }
}

