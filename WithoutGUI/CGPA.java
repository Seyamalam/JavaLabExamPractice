package com.javalab.firstproject;

import java.util.Scanner;

public class CGPA{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double[] grades = new double[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter grade for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        double cgpa = calculateCGPA(grades);
        System.out.println("CGPA: " + cgpa);
    }

    public static double calculateCGPA(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}