package com.example.task8.task8;

import com.example.task8.task8.services.CacheService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Task8Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Task8Application.class,args);
		CacheService cacheService = context.getBean(CacheService.class);
		cacheService.CacheData("user123","Satyam");
	}
}
