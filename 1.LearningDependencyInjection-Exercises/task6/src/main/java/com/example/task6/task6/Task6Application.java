package com.example.task6.task6;

import com.example.task6.task6.painters.Painter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Task6Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Task6Application.class, args);
		Painter painter = context.getBean(Painter.class);
		painter.work();
	}

}
