package com.javaguru.lessons.lesson5;

import java.util.Objects;

public class Duck {

    private int age;
    private double weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Duck duck = (Duck) o;
        return age == duck.age &&
                Double.compare(duck.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, weight);
    }
}
