package com.example.task9.task9.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
//@Scope("prototype")
public class RandomNumberGenerator {
    private final Random random = new Random();
    public  int randomNumber(){
        return random.nextInt(100);
    }

    public String getInstanceId(){
        return "Instance Id: " + this.hashCode();
    }

}
