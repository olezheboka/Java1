package com.javaguru.lessons.lesson5;

public class TvController {


    private boolean isControllerConnectedToTv;
    private Tv tv;


    public void connectControllerToTv() {
        isControllerConnectedToTv = true;
        System.out.println("Controller is now connected to TV");
    }

    public void turnTvOn() {
        if (!isControllerConnectedToTv) {
            System.out.println("Couldn't turn on, controller is not connected");
        } else if (tv.isTvIsOn()) {
            System.out.println("Couldn't turn on, TV is already on");
        } else {
            tv.turnTvOn();
        }
    }

    public void turnTvOff() {
        if (!isControllerConnectedToTv) {
            System.out.println("Couldn't turn tv Off, controller is not connected");
        } else if (!tv.isTvIsOn()) {
            System.out.println("Couldn't turn off, TV is already OFF");
        } else {
            tv.turnTvOff();
        }
    }

    public void nextChannel() {
        if (!tv.isTvIsOn()) {
            System.out.println("Couldn't switch channel, TV is off");
        } else if (!isControllerConnectedToTv) {
            System.out.println("Couldn't switch channel, controller is not connected to TV");
        } else {
            tv.nextChannel();
        }
    }

    public void increaseVolume() {
        if (!tv.isTvIsOn()) {
            System.out.println("TV is off");
        } else if (!isControllerConnectedToTv) {
            System.out.println("Controller is not connected");
        } else {
            tv.increaseVolume();
        }
    }

    public boolean isControllerConnectedToTv() {
        return isControllerConnectedToTv;
    }

    public void setControllerConnectedToTv(boolean controllerConnectedToTv) {
        isControllerConnectedToTv = controllerConnectedToTv;
    }

    public Tv getTv() {
        return tv;
    }

    public void setTv(Tv tv) {
        this.tv = tv;
    }


}
