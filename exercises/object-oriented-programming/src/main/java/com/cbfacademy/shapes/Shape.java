package com.cbfacademy.shapes;

public abstract class Shape {
    private String name;

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    // Abstract method to get the area of the shape
    public abstract double getArea();

    // Getter method for the name of the shape
    public String getName() {
        return name;
    }
}
