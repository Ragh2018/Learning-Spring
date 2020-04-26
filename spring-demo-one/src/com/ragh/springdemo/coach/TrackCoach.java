package com.ragh.springdemo.coach;

import com.ragh.springdemo.fortune.FortuneService;

public class TrackCoach implements Coach {

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

}
