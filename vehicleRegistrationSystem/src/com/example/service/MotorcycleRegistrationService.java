package com.example.service;

import com.example.model.*;

import java.io.IOException;

public class MotorcycleRegistrationService extends VehicleRegistrationService{
    public Vehicle specificInfo() throws IOException {
        System.out.print("Does this motorcycle have sidecar: ");
        String x = br.readLine();

        Boolean hasSideCar = null;
        if(x.equalsIgnoreCase("yes")){
            hasSideCar = true;
        }else if(x.equalsIgnoreCase("no")){
            hasSideCar = false;
        }
        Vehicle motorcycle = new Motorcycle(super.getVehicle().getBrand(), super.getVehicle().getModel(), hasSideCar);
        return motorcycle;
    }
}
