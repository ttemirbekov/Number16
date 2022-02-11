package com.company;

public class Circle {
    public static final double PI = 3.14;


    public static void area(double radius) {
        System.out.println("Area of Circle : " + (PI * (radius * radius)));
    }

    public static void cirumference(double radius) {
        System.out.println("Circumference of Circle : " + (PI * 2 * radius));
    }


}
