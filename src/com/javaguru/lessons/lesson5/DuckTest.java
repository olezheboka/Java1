package com.javaguru.lessons.lesson5;

public class DuckTest {

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setAge(1);
        duck.setWeight(10.5);
        System.out.println(duck);

        Duck secondDuck = new Duck();
        secondDuck.setWeight(10.5);
        secondDuck.setAge(1);

        if (duck.equals(secondDuck)) {
            System.out.println("Ducks are equal");
        } else {
            System.out.println("Ducks are not equal");
        }

        System.out.println();

        Duck thirdDuck = secondDuck;
        System.out.println(thirdDuck);
        System.out.println(secondDuck);

        thirdDuck.setAge(2);

        System.out.println();

        System.out.println(thirdDuck);
        System.out.println(secondDuck);

    }


}
