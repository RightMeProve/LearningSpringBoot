package com.example.task9.task9.service;

import org.springframework.stereotype.Component;

@Component
public class Dice {
    private final RandomNumberGenerator rng;

    public Dice(RandomNumberGenerator rng){
        this.rng = rng;
    }

    public void roll(){
        System.out.println("Dice rolled: "+rng.randomNumber());
        System.out.println("Dice RNG -> "+rng.getInstanceId());
    }
}
