package com.cbfacademy.shapes;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        super();
        this.radius = radius;
        this.height = height;
        
    }

    // Override getArea method for Cylinder
    @Override
    public double getArea() {
        return height * Math.PI * Math.pow(radius, 2);
    }
}