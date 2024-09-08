package com.example.service;

import com.example.model.*;

import java.io.IOException;

public class TruckRegistrationService extends VehicleRegistrationService{
    public Vehicle specificInfo() throws IOException {
        System.out.print("Enter pay load capacity: ");
        double payLoadCapacity = Double.parseDouble(br.readLine());
        Vehicle truck = new Truck(super.getVehicle().getBrand(), super.getVehicle().getModel(), payLoadCapacity);
        return truck;
    }
}
