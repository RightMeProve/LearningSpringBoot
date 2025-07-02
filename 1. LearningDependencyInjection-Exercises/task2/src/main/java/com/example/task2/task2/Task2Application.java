package com.example.task2.task2;

import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Task2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Task2Application.class, args);
		UserService userService = context.getBean(UserService.class);
		userService.createUser();
	}

}
