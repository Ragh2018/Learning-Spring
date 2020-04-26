package com.ragh.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements ForturneService {

	@Override
	public String getFortune() {
		
		return "Today is your lucky day";
	}

}
