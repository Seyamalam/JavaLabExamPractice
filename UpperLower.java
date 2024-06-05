package com.javalab.firstproject;

import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String upperCase = convertToUpperCase(input);
        String lowerCase = convertToLowerCase(input);

        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);

        scanner.close();
    }

    public static String convertToUpperCase(String input) {
        return input.toUpperCase();
    }

    public static String convertToLowerCase(String input) {
        return input.toLowerCase();
    }
}
