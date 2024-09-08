package com.example.model;

public class Vehicle {
    public static final int MAX_VEHICLE_COUNT = 1000;
    private String brand;
    private String model;

    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    public void displayInfo(){
        System.out.println("\nBrand : " + this.brand);
        System.out.println("Model : " + this.model);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
