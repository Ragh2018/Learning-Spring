/**
 * 
 */
package com.ragh.springdemo.coach;

import com.ragh.springdemo.fortune.FortuneService;

/**
 * @author ragsingh
 *
 */
public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	private String emailAddress;
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public BaseballCoach(FortuneService fortuneService, String emailAddress, String team) {
		this.fortuneService = fortuneService;
		this.emailAddress = emailAddress;
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {

		return "BaseballCoach :" + fortuneService.getFortune();
	}
}
