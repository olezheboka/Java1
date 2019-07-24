package com.javaguru.lessons.lesson3;

public class Human {

    private String name;
    private int age;

    public void greet() {
        System.out.println("Hi, my name is " + name + " I am " + age + " years old");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

