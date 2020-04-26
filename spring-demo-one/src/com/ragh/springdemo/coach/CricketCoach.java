/**
 * 
 */
package com.ragh.springdemo.coach;

import com.ragh.springdemo.fortune.FortuneService;

/**
 * @author ragsingh
 *
 */
public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach() {
	}

	//setter will call this to set
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do some bowling practice";
	}

	@Override
	public String getDailyFortune() {
		return "CricketCoach :"+fortuneService.getFortune();
	}

}
