package com.ragh.springdemo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ragh.springdemo.coach.*;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean(BaseballCoach.class);

		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		System.out.println(theCoach.getEmailAddress());

		System.out.println(theCoach.getTeam());

		context.close();
	}

}
