package com.javaguru.lessons.lesson8.Shapes;

public class ShapeDemo {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Rectangle("Rectangle", 2, 3);
        shapes[1] = new Circle("Circle", 5);
        shapes[2] = new Square("Square", 16);
        shapes[3] = new Triangle("Triange", 6, 3);

        for (Shape shape : shapes) {
            System.out.println(shape.getName() + " area: " + shape.getArea());
        }

    }

}
