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

	//Dependent object
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	//setter will call this to set from bean configuration
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}
	//setter will call this to set from bean configuration
	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach() {
	}

	//setter will call this to set from bean configuration
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
	
	public void doMyStartupStuff()
	{
		System.out.println("Inside CricketCoach doMyStartupStuff init method Yo Yo");
	}
	//adding destroy method
	public void doMyCleanUpStuff()
	{
		System.out.println("Inside CricketCoach doMyCleanUpStuff destroy method Yala Yolo");
	}

}
