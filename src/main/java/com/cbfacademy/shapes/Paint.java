package com.cbfacademy.shapes;

public class Paint {
    private double coverage; // Square feet per gallon

    // Constructor
    public Paint(double coverage) {
        this.coverage = coverage;
    }

    // Method to calculate the amount of paint needed for a shape
    public double getAmount(Shape shape) {
        // Ensure non-negative coverage and area
        if (coverage <= 0 || shape.getArea() < 0) {
            throw new IllegalArgumentException("Invalid coverage or shape area");
        }

        // Calculate the amount of paint needed in gallons
        return shape.getArea() / coverage;
    }
}