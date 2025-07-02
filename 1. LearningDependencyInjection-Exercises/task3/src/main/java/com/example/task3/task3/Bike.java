package com.example.task3.task3;

import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Transport{
    @Override
    public void move(){
        System.out.println("Driving a Bike");
    }
}
