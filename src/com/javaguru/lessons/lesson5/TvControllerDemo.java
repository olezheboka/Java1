package com.javaguru.lessons.lesson5;

public class TvControllerDemo {

    public static void main(String[] args) {
        Tv televizor = new Tv();
        televizor.setCurrentChannel(1);
        televizor.setCurrentVolume(50);
        televizor.setTvIsOn(false);
        televizor.setManufacturer("Sony");

        TvController puljt = new TvController();
        puljt.setTv(televizor);
        puljt.connectControllerToTv();

        System.out.println(televizor);

        puljt.turnTvOn();
        puljt.nextChannel();
        puljt.increaseVolume();

        System.out.println(televizor);

    }

}
