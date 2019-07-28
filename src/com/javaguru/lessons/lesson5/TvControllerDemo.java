package com.javaguru.lessons.lesson5;

public class TvControllerDemo {

    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.setCurrentChannel(1);
        tv.setCurrentVolume(50);
        tv.setTvIsOn(false);
        tv.setManufacturer("Sony");

        TvController tvController = new TvController();
        tvController.setTv(tv);
        tvController.connectControllerToTv();

        System.out.println(tv);

        tvController.turnTvOn();
        tvController.nextChannel();
        tvController.increaseVolume();

        System.out.println(tv);

    }

}
