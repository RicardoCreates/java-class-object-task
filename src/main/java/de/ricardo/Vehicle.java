package de.ricardo;

import java.util.Objects;

public class Vehicle {

    private String manufacturer;
    private String model;
    private int yearOfManurfacture;

    public Vehicle(String manufacturer, String model, int yearOfManurfacture) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfManurfacture = yearOfManurfacture;
    }

    public void displayInfo() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Year of Manufacture: " + yearOfManurfacture);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManurfacture() {
        return yearOfManurfacture;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfManurfacture(int yearOfManurfacture) {
        this.yearOfManurfacture = yearOfManurfacture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return yearOfManurfacture == vehicle.yearOfManurfacture && Objects.equals(manufacturer, vehicle.manufacturer) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, yearOfManurfacture);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManurfacture=" + yearOfManurfacture +
                '}';
    }
}
