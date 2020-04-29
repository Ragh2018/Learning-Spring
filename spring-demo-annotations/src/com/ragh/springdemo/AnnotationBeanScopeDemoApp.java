package com.ragh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ragh.springdemo.coach.Coach;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach=context.getBean(Coach.class);
		
		Coach alphaCoach=context.getBean(Coach.class);
		
		System.out.print(theCoach==alphaCoach);
	}

}
