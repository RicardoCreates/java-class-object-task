package de.ricardo;

public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String manufacturer, String model, int yearOfManurfacture, int numberOfDoors) {
        super(manufacturer, model, yearOfManurfacture);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }

}
