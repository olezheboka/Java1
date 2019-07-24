package com.javaguru.lessons.lesson8.Shapes;

public class Triangle extends AbstractShape {

    private int base;
    private int height;

    public Triangle(String name, int base, int height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }
}
