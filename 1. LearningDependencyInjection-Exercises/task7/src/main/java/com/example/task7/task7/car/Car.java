package com.example.task7.task7.car;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Engine engine;

    public Car(Engine engine){
        this.engine = engine;
        System.out.println("Car Created with Engine!");
    }

    public void drive(){
        engine.start();
        System.out.println("Car driving!");
    }
}
