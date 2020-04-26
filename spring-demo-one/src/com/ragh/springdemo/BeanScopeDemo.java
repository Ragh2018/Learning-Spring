/**
 * 
 */
package com.ragh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ragh.springdemo.coach.Coach;
import com.ragh.springdemo.coach.CricketCoach;

/**
 * @author ragsingh
 *
 */
public class BeanScopeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach theCoach=context.getBean(CricketCoach.class);
		
		Coach alphaCoach=context.getBean(CricketCoach.class);
		
		System.out.println(theCoach==alphaCoach);
		
		context.close();
	}

}
