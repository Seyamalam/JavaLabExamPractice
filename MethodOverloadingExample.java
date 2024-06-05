package com.javalab.firstproject;

public class MethodOverloadingExample {
   
    public static int add(int a, int b) {
        return a + b;
    }

    
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    
    public static String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Adding integers:");
        System.out.println("Result of adding 3 and 5: " + add(3, 5));
        System.out.println("Result of adding 3, 5, and 7: " + add(3, 5, 7));

        System.out.println("\nConcatenating strings:");
        System.out.println("Result of concatenating 'Hello' and 'World': " + add("Hello", "World"));
    }
}
