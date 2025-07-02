package com.example.task7.task7;

import com.example.task7.task7.car.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Task7Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Task7Application.class,args);
		Car car = context.getBean(Car.class);
		car.drive();
	}

}
