package com.javaguru.lessons.lesson8.Animals;

import java.util.Objects;

public class Animal {

    protected int age;

    public Animal(int age) {
        this.age = age;
    }

    public void breath() {
        System.out.println("Breathing");
    }

    public void eat() {
        System.out.println("Eating");
    }

    public void voice() {
        System.out.println("Making voices");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                '}';
    }
}
