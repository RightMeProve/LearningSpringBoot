package com.example.task2.task2;

import org.springframework.stereotype.Component;

@Component
public class LoggerService implements Logger{
    public String login(){
        return "Login Services!";
    }
}
