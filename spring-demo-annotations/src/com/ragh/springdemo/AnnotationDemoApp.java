package com.ragh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach=context.getBean(Coach.class);
		System.out.println(theCoach.getDailyRoutine());
		System.out.println(theCoach.getFortune());
		context.close();
	}

}
