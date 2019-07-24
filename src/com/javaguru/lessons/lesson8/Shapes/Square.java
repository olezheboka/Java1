package com.javaguru.lessons.lesson8.Shapes;

public class Square extends AbstractShape {

    private int side;

    public Square(String name, int side) {
        super(name);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
