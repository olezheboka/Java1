package com.javaguru.lessons.lesson3;

public class HamsterTest {

    public static void main(String[] args) {
        Hamster firstHamster = new Hamster();
        firstHamster.run();

        firstHamster.setAge(2);
        firstHamster.setWeight(2000);
        firstHamster.setHungry(true);
        firstHamster.setName("Ponchik");

        firstHamster.run();
        System.out.println("Hamster age = " + firstHamster.getAge());
        System.out.println("Hamster hungry " + firstHamster.isHungry());
    }
}
