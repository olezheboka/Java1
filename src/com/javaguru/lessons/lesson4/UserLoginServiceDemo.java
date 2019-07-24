package com.javaguru.lessons.lesson4;

public class UserLoginServiceDemo {

    public static void main(String[] args) {
        UserLoginService service = new UserLoginService();
        User userOne = new User("user-login", "user-password");

        service.login(userOne, "user-password-12345");
        service.login(userOne, "hujasword");
        service.login(userOne, "hujasword");
        service.login(userOne, "hujasword");
        service.login(userOne, "user-password");
    }
}
