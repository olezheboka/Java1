package com.javaguru.lessons.lesson8.Animals;

import java.util.Objects;

public class Mammal extends Animal {

    protected String mammalType;

    public Mammal(int age, String mammalType) {
        super(age);
        this.mammalType = mammalType;
    }

    public void feedWithMilk() {
        System.out.println("Feeding progeny with milk");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return Objects.equals(mammalType, mammal.mammalType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mammalType);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "mammalType='" + mammalType + '\'' +
                ", age=" + age +
                '}';
    }
}
