package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Radius of Circle: ");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();

        Circle circle = new Circle();
        circle.circumference(radius);
        circle.area(radius);

    }
}
