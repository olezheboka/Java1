package com.javaguru.lessons.lesson6;

public class CarDemo {

    public static void main(String[] args) {
        Car demoCar = new Car("BMW", "white", 70);
        System.out.println(demoCar);
        System.out.println("Current speed is " + demoCar.getCurrentSpeed());
        System.out.println("If car can accelerate? : " + demoCar.canAccelerate());
        System.out.println("Accelerating...");
        demoCar.accelerate(50);
        System.out.println("Current speed is " + demoCar.getCurrentSpeed());
        System.out.println("If car is stopped :" + demoCar.isStopped());
        System.out.println("Accelerating...");
        demoCar.accelerate(100);
        System.out.println("Current speed is " + demoCar.getCurrentSpeed());
        System.out.println("If car is driving :" + demoCar.isDriving());
        System.out.println("Decelerating...");
        demoCar.decelerate(30);
        System.out.println("Current speed is " + demoCar.getCurrentSpeed());

    }

}
