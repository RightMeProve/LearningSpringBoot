package com.example.task10.task10;

import com.example.task10.task10.payment.PaymentManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Task10Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Task10Application.class, args);
		PaymentManager paymentManager = context.getBean(PaymentManager.class);
		paymentManager.pay(25000);
	}

}
