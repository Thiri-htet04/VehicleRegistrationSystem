package com.example.service;

import com.example.model.*;

import java.io.IOException;

public class CarRegistrationService extends VehicleRegistrationService{
    public Vehicle specificInfo() throws IOException {
        System.out.print("Enter number of doors: ");
        int doors = Integer.parseInt(br.readLine());
        Vehicle car = new Car(super.getVehicle().getBrand(), super.getVehicle().getModel(), doors);

        return car;
    }

}
