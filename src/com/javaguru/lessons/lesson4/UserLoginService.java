package com.javaguru.lessons.lesson4;

public class UserLoginService {

    boolean login(User user, String password) {
        String userPassword = user.getPassword();
        boolean userStatus = user.isUserBlocked();
        if (userPassword.equals(password) && !userStatus) {
            user.resetNumberOfTries();
            System.out.println("Successfully logged in");
            return true;
        } else {
            user.decreaseNumberOfTries();
            int userNumberOfTries = user.getNumberOfTries();
            if (userNumberOfTries > 0) {
                System.out.println("Login failed, tries left : " + userNumberOfTries);
            } else {
                user.blockUser();
                System.out.println("You have reached login try limit and have been blocked ");
            }
            return false;
        }

    }

}