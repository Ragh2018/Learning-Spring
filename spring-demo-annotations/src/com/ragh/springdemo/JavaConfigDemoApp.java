package com.ragh.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ragh.springdemo.coach.Coach;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring config java class 
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		//Here you can provide the beanid by default it is className
		Coach theCoach=context.getBean(Coach.class);
		System.out.println(theCoach.getDailyRoutine());
		System.out.println(theCoach.getFortune());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		context.close();
	}

}
