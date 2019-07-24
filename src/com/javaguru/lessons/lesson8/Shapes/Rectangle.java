package com.javaguru.lessons.lesson8.Shapes;

public class Rectangle extends AbstractShape {

    private int width;
    private int height;

    public Rectangle(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

