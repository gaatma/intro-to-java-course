package com.cbfacademy.shapes;

public class Sphere extends Shape {
    private double radius;

    // Constructor
    public Sphere(double radius) {
        super();
        this.radius = radius;
    }

    // Override getArea method for Sphere
    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}