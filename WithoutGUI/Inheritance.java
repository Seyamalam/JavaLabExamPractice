package com.javalab.firstproject;

class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Driving a car...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.drive();

        Car car = new Car();
        car.drive();
    }
}
