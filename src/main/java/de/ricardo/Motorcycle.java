package de.ricardo;

import java.util.Objects;

public class Motorcycle extends Vehicle {

    private String type;

    public Motorcycle(String manufacturer, String model, int yearOfManurfacture, String type) {
        super(manufacturer, model, yearOfManurfacture);
        this.type = type;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Type: " + type);
    }
}