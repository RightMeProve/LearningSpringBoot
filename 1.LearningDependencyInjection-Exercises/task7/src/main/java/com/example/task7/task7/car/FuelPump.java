package com.example.task7.task7.car;

import org.springframework.stereotype.Component;

@Component
public class FuelPump {
    public FuelPump(){
        System.out.println("Fuel Pump Created!");
    }

    public void supplyFuel(){
        System.out.println("Fuel Supplied!");
    }
}
