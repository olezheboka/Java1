package com.javaguru.lessons.lesson3;

public class DogDemo {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.voice();

        dog.setAge(5);
        dog.setName("Pjos barbos");
        dog.setColor("Black");

        dog.getAge();
        int age = dog.getAge();
        System.out.println("Dog's age = " + age);

        dog.getColor();
        String color = dog.getColor();
        System.out.println("Dog's color = " + color);

        dog.getName();
        String name = dog.getName();
        System.out.println("Dogs' name = " + name);

    }
}
