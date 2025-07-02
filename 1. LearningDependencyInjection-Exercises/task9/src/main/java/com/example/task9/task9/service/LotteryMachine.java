package com.example.task9.task9.service;

import org.springframework.stereotype.Component;

@Component
public class LotteryMachine {
    private final RandomNumberGenerator rng;

    public LotteryMachine(RandomNumberGenerator rng){
        this.rng = rng;
    }

    public void draw(){
        System.out.println("Lottery number: "+rng.randomNumber());
        System.out.println("Lottery -> "+rng.getInstanceId());
    }
}
