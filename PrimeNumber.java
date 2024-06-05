package com.javalab.firstproject;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(number + (isPrime ? " is a prime number." : " is not a prime number."));
        scanner.close();
    }
}
