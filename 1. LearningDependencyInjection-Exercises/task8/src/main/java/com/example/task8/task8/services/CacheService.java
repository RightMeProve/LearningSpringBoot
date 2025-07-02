package com.example.task8.task8.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CacheService {
    @Autowired(required = false) // 🔑 Optional dependency
    private LoggerService loggerService;

    public void CacheData(String key,String val){
        System.out.println("Caching Data: "+key +" -> " + val);
        if(loggerService != null){
            loggerService.log("Cached Key: "+key);
        }
        else {
            System.out.println("Logger service is not available.");
        }
    }
}
