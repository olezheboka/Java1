package com.javaguru.lessons.lesson8.Animals;

import java.util.Objects;

public class Parrot extends Bird {

    private String name;

    public Parrot(int age, String birdType, String name) {
        super(age, birdType);
        this.name = name;
    }

    public void talk() {
        System.out.println("Talking like a human");
    }

    @Override
    public void eat() {
        System.out.println("Eating bird food");
    }

    @Override
    public void voice() {
        System.out.println("Tweet tweet");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Parrot parrot = (Parrot) o;
        return Objects.equals(name, parrot.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                ", birdType='" + birdType + '\'' +
                ", age=" + age +
                '}';
    }
}
