package com.javaguru.lessons.lesson8.Shapes;

public class Circle extends AbstractShape {

    private int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
}
