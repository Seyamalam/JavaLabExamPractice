package com.javalab.firstproject;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of a side of the square: ");
        double sideLength = scanner.nextDouble();

        double area = sideLength * sideLength;

        System.out.println("The area of the square is: " + area);

        scanner.close();
    }
}
