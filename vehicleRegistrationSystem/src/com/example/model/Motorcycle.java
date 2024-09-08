package com.example.model;

public class Motorcycle extends Vehicle{
    private boolean hasSideCar;
    public Motorcycle(String brand, String model, boolean hasSideCar) {
        super(brand, model);
        this.hasSideCar = hasSideCar;
    }
    public void displayInfo(){
        super.displayInfo();
        if(hasSideCar){
            System.out.println("This motorcycle has sidecar.");
        }
        System.out.println("This motorcycle does not have sidecar.");
    }
}
