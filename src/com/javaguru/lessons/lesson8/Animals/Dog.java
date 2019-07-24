package com.javaguru.lessons.lesson8.Animals;

import java.util.Objects;

public class Dog extends Mammal {

    private String name;
    private String breed;

    public Dog(int age, String mammalType, String name, String breed) {
        super(age, mammalType);
        this.name = name;
        this.breed = breed;
    }

    public void run() {
        System.out.println("Running fast like a dog");
    }

    public void playWithStick() {
        System.out.println("Playing with stick");
    }

    @Override
    public void feedWithMilk() {
        System.out.println("Feeding puppies with milk");
    }

    @Override
    public void eat() {
        System.out.println("Eating dog food");
    }

    @Override
    public void voice() {
        System.out.println("Barking");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) &&
                Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, breed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", mammalType='" + mammalType + '\'' +
                ", age=" + age +
                '}';
    }
}
