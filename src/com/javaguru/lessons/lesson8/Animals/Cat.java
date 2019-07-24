package com.javaguru.lessons.lesson8.Animals;

import java.util.Objects;

public class Cat extends Mammal {

    private String name;
    private String breed;

    public Cat(int age, String mammalType, String name, String breed) {
        super(age, mammalType);
        this.name = name;
        this.breed = breed;
    }

    @Override
    public void feedWithMilk() {
        System.out.println("Feeding kittens with milk");
    }

    @Override
    public void eat() {
        System.out.println("Eating cat food");
    }

    @Override
    public void voice() {
        System.out.println("Meow meow");
    }

    public void move() {
        System.out.println("Moving gracefully like a cat");
    }

    public void purr() {
        System.out.println("Purrrrrrrrr");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name) &&
                Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, breed);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", mammalType='" + mammalType + '\'' +
                ", age=" + age +
                '}';
    }


}
