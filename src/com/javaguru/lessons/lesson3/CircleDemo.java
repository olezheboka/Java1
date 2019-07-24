package com.javaguru.lessons.lesson3;

public class CircleDemo {

    public static void main(String[] args) {

        Circle myCirle = new Circle();
        myCirle.setPi(3.14);
        myCirle.setRadius(15);

        double area = myCirle.calculateArea();
        System.out.println("Radius = " + myCirle.getRadius() + ", Pi = 3.14" + ", Area = " + area);
    }
}
