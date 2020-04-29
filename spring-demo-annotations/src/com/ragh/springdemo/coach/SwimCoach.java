package com.ragh.springdemo.coach;

import org.springframework.beans.factory.annotation.Value;

import com.ragh.springdemo.fortune.FortuneService;
import com.ragh.springdemo.fortune.SadFortuneService;

public class SwimCoach implements Coach {

	FortuneService fortuneService;
	
	@Value("${ragh.email}")
	private String emailAddress;
	@Value("${ragh.mySwimCoach.team}")
	private String team;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	@Override
	public String getDailyRoutine() {
		// TODO Auto-generated method stub
		return "Do swimming for 1000 meter";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getEmailAddress() {
		return emailAddress;
	}

	@Override
	public String getTeam() {
		return team;
	}

}
