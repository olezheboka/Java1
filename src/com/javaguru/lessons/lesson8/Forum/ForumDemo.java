package com.javaguru.lessons.lesson8.Forum;

public class ForumDemo {

    public static void main(String[] args) {
        User user = new User();
        Moderator moderator = new Moderator();
        Administrator administrator = new Administrator();

        System.out.println("User:");

        user.readPost();
        user.writePost();

        System.out.println();


        System.out.println("Moderator:");

        moderator.readPost();
        moderator.writePost();
        moderator.deletePost();

        System.out.println();


        System.out.println("Administrator:");

        administrator.readPost();
        administrator.writePost();
        administrator.deletePost();
        administrator.blockUser();
    }
}
