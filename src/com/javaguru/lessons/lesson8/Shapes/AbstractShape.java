package com.javaguru.lessons.lesson8.Shapes;

public abstract class AbstractShape implements Shape {

    protected String name;
    protected double area;

    public AbstractShape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }
}
