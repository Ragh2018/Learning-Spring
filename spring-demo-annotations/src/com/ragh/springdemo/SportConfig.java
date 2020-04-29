package com.ragh.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.ragh.springdemo.coach.Coach;
import com.ragh.springdemo.coach.SwimCoach;
import com.ragh.springdemo.fortune.FortuneService;
import com.ragh.springdemo.fortune.SadFortuneService;

@Configuration
@PropertySource("classpath:sport.properties")
@PropertySource("classpath:sportnew.properties") // if same property present in both then it will read from the last
													// loaded by default
//Commented below line because we manually defined all the bean to check it is workin or not.
//@ComponentScan("com.ragh.springdemo")
public class SportConfig {
	
	//defining bean for sad fortune service and method name will be the bean id 
	
	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	}
	
	//defining bean for our swim coach and method name will be the bean id
	
	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach(sadFortuneService());
	}
}
