package com.cbfacademy.operators;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static double add(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");
        return operand1 + operand2;

    }

    public static double subtract(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");
        return operand1 - operand2;
    }

    public static double multiply(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");
        return operand1 * operand2;
    }

    public static Boolean areEqual(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");
            final double epsilon = 1e-10; 
            return Math.abs(operand1 - operand2) < epsilon;


    }

    public static Boolean isLessThan(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");
        return operand1 < operand2;
    }

    public static Boolean isMoreThan(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");
        return operand1 > operand2;
    }
}
