package com.example.service;

import com.example.dao.VehicleDao;
import com.example.model.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VehicleRegistrationService {
    private Vehicle vehicle;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void register() throws IOException {
        commonInfo();
        VehicleDao.create(specificInfo());

    }
    public void commonInfo() throws IOException {
        System.out.print("Enter brand: ");
        String brand = br.readLine();
        System.out.print("Enter model: ");
        String model = br.readLine();
        this.vehicle = new Vehicle(brand, model);
    }
    public Vehicle specificInfo() throws IOException {
        return null;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void display(){
        for(int i=0;  i< VehicleDao.getCount(); i++){
            VehicleDao.getAll()[i].displayInfo();
        }
    }
}
