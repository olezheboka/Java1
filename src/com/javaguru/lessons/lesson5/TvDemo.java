package com.javaguru.lessons.lesson5;

public class TvDemo {

    public static void main(String[] args) {
        Tv televizor = new Tv();
        televizor.setCurrentChannel(1);
        televizor.setCurrentVolume(50);
        televizor.setTvIsOn(false);
        televizor.setManufacturer("Sony");

        Tv televizor2 = new Tv();
        televizor2.setCurrentChannel(2);
        televizor2.setCurrentVolume(52);
        televizor2.setTvIsOn(false);
        televizor2.setManufacturer("Sony");

        System.out.println(televizor);

        televizor.turnTvOn();
        televizor.increaseVolume();
        televizor.increaseVolume();
        televizor.increaseVolume();
        televizor.decreaseVolume();
        televizor.nextChannel();
        televizor.nextChannel();
        televizor.previousChannel();

        System.out.println(televizor);
        System.out.println();

        televizor.turnTvOff();
        televizor.increaseVolume();
        televizor.nextChannel();

        System.out.println();

        System.out.println(televizor);
        System.out.println(televizor2);

        if (televizor.equals(televizor2)) {
            System.out.println("TVs are equal");
        } else {
            System.out.println("TVs are NOT equal");
        }
        System.out.println();
    }

}
