package com.example.task4.task4;

import com.example.task4.task4.systems.SystemCheckerConstructor;
import com.example.task4.task4.systems.SystemCheckerField;
import com.example.task4.task4.systems.SystemCheckerSetter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Task4Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Task4Application.class, args);
		SystemCheckerField field = context.getBean(SystemCheckerField.class);
		field.runChecks();

		SystemCheckerSetter setter = context.getBean(SystemCheckerSetter.class);
		setter.runCheck();

		SystemCheckerConstructor constructor =  context.getBean(SystemCheckerConstructor.class);
		constructor.runChecks();
	}
}
