package com.example.task7.task7.car;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    private final FuelPump fuelPump;

    public Engine(FuelPump fuelPump){
        this.fuelPump = fuelPump;
        System.out.println("Engine created with Fuelpump!");
    }

    public void start(){
        fuelPump.supplyFuel();
        System.out.println("Engine Started!");
    }
}
