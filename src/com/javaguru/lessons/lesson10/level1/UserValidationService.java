package com.javaguru.lessons.lesson10.level1;

public class UserValidationService {

    public void validate (User user) {

        String nameToValidate = user.getFirstName();
        String lastNameToValidate = user.getLastName();
        int ageToValidate = user.getAge();

        if (nameToValidate.length() < 3) {
            throw new UserValidationException("Name too short");
        }

        if (nameToValidate.length() > 15) {
            throw new UserValidationException("Name too long");
        }

        if (lastNameToValidate.length() < 3) {
            throw new UserValidationException("Last name too short");
        }

        if (lastNameToValidate.length() > 15) {
            throw new UserValidationException("Last name too long");
        }

        if (ageToValidate < 0 || ageToValidate > 120) {
            throw new UserValidationException("Invalid age");
        }



    }
}
