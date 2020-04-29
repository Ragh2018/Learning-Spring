/**
 * 
 */
package com.ragh.springdemo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ragh.springdemo.coach.Coach;
import com.ragh.springdemo.coach.CricketCoach;
import com.ragh.springdemo.coach.TrackCoach;

/**
 * @author ragsingh
 *
 */
public class BeanLifeCycle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycle-applicationContext.xml");
		// by registering the shutdownhook also you can't destroy the bean for scope
		// prototype you have manually do that by bean post processor
		Coach theCoach = context.getBean(TrackCoach.class);

		context.close();
	}

}
