package com.javaguru.lessons.lesson5;

import java.util.Objects;

public class Tv {

    private int currentChannel;
    private int currentVolume;
    private String manufacturer;
    private boolean TvIsOn;


    public void nextChannel() {
        if (TvIsOn) {
            currentChannel = currentChannel + 1;
        } else {
            System.out.println("Couldn't switch channel, TV is off");
        }

    }

    public void previousChannel() {
        if (TvIsOn) {
            currentChannel = currentChannel - 1;
        } else {
            System.out.println("Couldn't switch channel, TV is off");
        }
    }

    public void increaseVolume() {
        if (TvIsOn) {
            currentVolume = currentVolume + 1;
        } else {
            System.out.println("Couldn't increase volume, TV is off");
        }

    }

    public void decreaseVolume() {
        if (TvIsOn) {
            currentVolume = currentVolume - 1;
        } else {
            System.out.println("Couldn't decrease volume,TV is off");
        }
    }

    public void turnTvOn() {
        TvIsOn = true;
    }

    public void turnTvOff() {
        TvIsOn = false;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isTvIsOn() {
        return TvIsOn;
    }

    public void setTvIsOn(boolean tvIsOn) {
        TvIsOn = tvIsOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tv tv = (Tv) o;
        return currentChannel == tv.currentChannel &&
                currentVolume == tv.currentVolume &&
                TvIsOn == tv.TvIsOn &&
                Objects.equals(manufacturer, tv.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVolume, manufacturer, TvIsOn);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "currentChannel=" + currentChannel +
                ", currentVolume=" + currentVolume +
                ", manufacturer='" + manufacturer + '\'' +
                ", ifTvIsOn=" + TvIsOn +
                '}';
    }
}