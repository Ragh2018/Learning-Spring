package com.ragh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//Here you can provide the beanid by default it is className
		Coach theCoach=context.getBean(Coach.class);
		System.out.println(theCoach.getDailyRoutine());
		System.out.println(theCoach.getFortune());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		context.close();
	}

}
