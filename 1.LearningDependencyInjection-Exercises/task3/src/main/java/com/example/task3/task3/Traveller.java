package com.example.task3.task3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Traveller {
    private final Transport transport;

    Traveller(@Qualifier("car")Transport transport){
        this.transport = transport;
    }

    public void start(){
        System.out.println("Traveller starts journey.");
        transport.move();
    }
}
