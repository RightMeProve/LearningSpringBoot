package com.example.task9.task9;

import com.example.task9.task9.service.Dice;
import com.example.task9.task9.service.LotteryMachine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Task9Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Task9Application.class, args);
		Dice dice = context.getBean(Dice.class);
		LotteryMachine lottery = context.getBean(LotteryMachine.class);

		dice.roll();
		System.out.println("--------");
		lottery.draw();
	}

}
