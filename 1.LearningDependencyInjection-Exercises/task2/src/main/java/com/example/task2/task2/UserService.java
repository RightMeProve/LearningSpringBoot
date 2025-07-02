package com.example.task2.task2;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    private final LoggerService loggerService;
    private final NotificationService notificationService;

    UserService(LoggerService loggerService,NotificationService notificationService){
        this.loggerService = loggerService;
        this.notificationService = notificationService;
    }

    void createUser(){
        System.out.println("User Created!!");
        System.out.println(loggerService.login());
        System.out.println(notificationService.notifyMe());
    }
}
