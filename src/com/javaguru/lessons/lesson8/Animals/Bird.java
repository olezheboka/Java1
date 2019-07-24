package com.javaguru.lessons.lesson8.Animals;

import java.util.Objects;

public class Bird extends Animal {

    protected String birdType;

    public Bird(int age, String birdType) {
        super(age);
        this.birdType = birdType;
    }

    public void fly() {
        System.out.println("Flying incredibly");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(birdType, bird.birdType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), birdType);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "birdType='" + birdType + '\'' +
                ", age=" + age +
                '}';
    }
}
