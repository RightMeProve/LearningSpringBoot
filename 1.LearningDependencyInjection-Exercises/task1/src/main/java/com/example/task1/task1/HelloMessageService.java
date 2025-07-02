package com.example.task1.task1;

import org.springframework.stereotype.Component;

@Component
public class HelloMessageService implements MessageService{
    @Override
    public void printHello(){
        System.out.println("Started Message Service!");
    }
}
