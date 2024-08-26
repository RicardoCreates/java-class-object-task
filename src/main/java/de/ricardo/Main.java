package de.ricardo;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("BMW", "m3", 2020);
        Car car = new Car("BMW", "M5", 2022, 4);
        Motorcycle motorcycle = new Motorcycle("Kavasaki", "Ninja" , 2018, "Sport");

        System.out.println("Vehicle Info:");
        vehicle.displayInfo();

        System.out.println("Car Info:");
        car.displayInfo();

        System.out.println("Motorcycle Info:");
        motorcycle.displayInfo();
        System.out.println("Motorcycle Type: " + motorcycle.getType());

    }
}