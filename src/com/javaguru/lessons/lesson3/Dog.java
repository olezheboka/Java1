package com.javaguru.lessons.lesson3;

public class Dog {

    private int age;
    private String name;
    private String color;

    public void voice() {
        System.out.println("Voice");
    }

    public void eat() {
        System.out.println("Eat");
    }

    public void sleep() {
        System.out.println("Sleep");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
