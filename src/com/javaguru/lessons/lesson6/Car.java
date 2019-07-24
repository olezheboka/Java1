package com.javaguru.lessons.lesson6;

import java.util.Objects;

public class Car {

    private String model;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    void accelerate(int targetSpeed) {
        if (targetSpeed > maxSpeed) {
            targetSpeed = maxSpeed;
        }
        for (int i = currentSpeed; i <= targetSpeed; i++) {
            currentSpeed = i;
        }
    }

    void decelerate(int targetSpeed) {
        if (targetSpeed < 0) {
            targetSpeed = 0;
        }
        for (int i = currentSpeed; i >= targetSpeed; i--) {
            currentSpeed = i;
        }

    }

    boolean isDriving() {
        return currentSpeed > 0;
    }

    boolean isStopped() {
        return currentSpeed <= 0;
    }


    boolean canAccelerate() {
        return currentSpeed > maxSpeed;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentSpeed=" + currentSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed &&
                currentSpeed == car.currentSpeed &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, maxSpeed, currentSpeed);
    }
}
