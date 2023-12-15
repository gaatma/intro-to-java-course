package com.cbfacademy.shapes;

public class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    // Override getArea method for Rectangle
    @Override
    public double getArea() {
        return length * width;
    }
}