package com.example.task2.task2;

import org.springframework.stereotype.Component;

@Component
public class NotificationService implements Notification{
    public String notifyMe(){
        return "Notification Service!";
    }
}
