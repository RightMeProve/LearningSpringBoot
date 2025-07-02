package com.example.task1.task1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Task1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Task1Application.class, args);
		MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);
		messagePrinter.print();
	}

}
