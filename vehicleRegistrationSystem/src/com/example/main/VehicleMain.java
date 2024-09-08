package com.example.main;

import com.example.model.*;
import com.example.service.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VehicleMain {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        VehicleRegistrationService service = null;
        String flag;
        do{
            System.out.print("Enter vehicle type: ");
            String type = br.readLine();
            if (type.equalsIgnoreCase("car")){
                service = new CarRegistrationService();
            }else if(type.equalsIgnoreCase("motorcycle")){
                service = new MotorcycleRegistrationService();
            }else if(type.equalsIgnoreCase("truck")){
                service = new TruckRegistrationService();
            }
            service.register();
            System.out.print("\nDo you want to add another vehicle? (yes / no) : ");
            flag = br.readLine();
        }while (flag.equalsIgnoreCase("yes"));
        service.display();
    }
}
