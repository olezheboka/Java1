package com.javaguru.lessons.lesson3;

public class Circle {

    private double radius;
    private double pi;

    public double calculateArea() {
        return radius * radius * pi;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getPi() {
        return pi;
    }
}
