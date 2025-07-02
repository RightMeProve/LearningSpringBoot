package com.example.task8.task8.services;

import org.springframework.stereotype.Component;

@Component
public class LoggerService {
    public void log(String message){
        System.out.println("Logger service: "+message);
    }
}
