package com.example.dao;

import com.example.model.Vehicle;


public class VehicleDao {
    private static int  count = 0;
    private static Vehicle[] vehicleDB = new Vehicle[Vehicle.MAX_VEHICLE_COUNT];
    public static void create(Vehicle vehicle){
        vehicleDB[count] = vehicle;
        count++;
    }
    public static Vehicle[] getAll(){
        return vehicleDB;
    }

    public static int getCount() {
        return count;
    }
}
