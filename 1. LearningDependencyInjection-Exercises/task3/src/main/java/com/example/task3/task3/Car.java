package com.example.task3.task3;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Transport{
    @Override
    public void move(){
        System.out.println("Driving a car");
    }
}
