package com.example.task3.task3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Task3Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Task3Application.class, args);
		Traveller traveller = context.getBean(Traveller.class);
		traveller.start();
	}

}
