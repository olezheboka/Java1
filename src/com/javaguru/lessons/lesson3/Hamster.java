package com.javaguru.lessons.lesson3;

public class Hamster {

    private String name;
    private int age;
    private double weight;
    private boolean hungry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void bite() {
        System.out.println("I'm hungry");
    }

    public void run() {
        System.out.println("My weight is " + weight + ", I need to run fast");
    }
}
