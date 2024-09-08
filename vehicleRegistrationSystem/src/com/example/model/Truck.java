package com.example.model;

import com.sun.security.jgss.GSSUtil;

public class Truck extends Vehicle{
    private double payLoadCapacity;
    public Truck(String brand, String model, double payLoadCapacity){
        super(brand, model);
        this.payLoadCapacity = payLoadCapacity;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("PayLoadCapacity : " + payLoadCapacity);
    }
}
