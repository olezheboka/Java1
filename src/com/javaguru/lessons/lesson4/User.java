package com.javaguru.lessons.lesson4;

public class User {

    private String login;
    private String password;
    private boolean userBlocked;
    private int numberOfTries;

    public void resetNumberOfTries() {
        this.numberOfTries = 3;
    }

    public void decreaseNumberOfTries() {
        this.numberOfTries = numberOfTries - 1;
    }

    public void blockUser() {
        if (numberOfTries > 3) {
            userBlocked = true;
        }
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setNumberOfTries(int numberOfTries) {
        this.numberOfTries = numberOfTries;
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUserBlocked(boolean userBlocked) {
        this.userBlocked = userBlocked;
    }

    public boolean isUserBlocked() {
        return userBlocked;
    }

    public User(String login, String password) {
        this.password = password;
        this.login = login;
        this.numberOfTries = 3;
    }
}
