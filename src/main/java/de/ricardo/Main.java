package de.ricardo;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("BMW", "m3", 2020);
        Car car = new Car("BMW", "M5", 2022, 4);

        System.out.println("Vehicle Info:");
        vehicle.displayInfo();

        System.out.println("Car Info:");
        car.displayInfo();
    }
}