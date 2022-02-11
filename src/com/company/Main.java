package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Radius of Circle: ");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
       
        Circle circlce = new Circle();
        circlce.area(radius);
        circlce.cirumference(radius);
    }
}
