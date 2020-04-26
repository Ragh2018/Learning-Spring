package com.ragh.springdemo.coach;

import org.springframework.beans.factory.DisposableBean;

import com.ragh.springdemo.fortune.FortuneService;

public class TrackCoach implements Coach, DisposableBean {

	private FortuneService fortuneService;

	private String emailAddress;
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	// at the time of bean creation it will set dependent object and other args
	// value
	public TrackCoach(FortuneService fortuneService, String emailAddress, String team) {
		this.fortuneService = fortuneService;
		this.emailAddress = emailAddress;
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "run for 30k";
	}

	@Override
	public String getDailyFortune() {
		return "TrackCoach : " + fortuneService.getFortune();
	}

	// adding init method

	public void doMyStartupStuff() {
		System.out.println("Inside TrackCoach init method Yo Yo");
	}

	// adding destroy method but this method will not get called because scope for
	// this class in beanLifeCycle-applicationContext.xml is defined as prototype
	public void doMyCleanUpStuff() {
		System.out.println("Inside TrackCoach destroy method Yala Yolo");
	}

	// destroy method overrided because we implemented DisposableBean and this will
	// destroy the bean object
	@Override
	public void destroy() throws Exception {

		System.out.println("Inside TrackCoach destroy method Yala Yolo");
	}
}
