package com.example.task5.task5;

import com.example.task5.task5.manager.ShapeManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Task5Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Task5Application.class, args);
		ShapeManager manager = context.getBean(ShapeManager.class);
		manager.render();
	}

}
