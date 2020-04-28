package com.ragh.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	//Field Injection
	@Autowired
	@Qualifier("happyFortuneService")
	private ForturneService forturneService;

	
	// As of Spring Framework 4.3, an @Autowired annotation on such a constructor is
	// no longer necessary if the target bean only defines one constructor to begin
	// with. However, if several constructors are available, at least one must be
	// annotated to teach the container which one to use.
	
	//Constructor Injection
	/*
	 * @Autowired public TennisCoach(ForturneService forturneService) {
	 * this.forturneService = forturneService; }
	 */
	//Setter Injection
	/*
	 * @Autowired public void setForturneService(ForturneService forturneService) {
	 * this.forturneService=forturneService; }
	 */
	@Value("${ragh.email}")
	private String emailAddress;
	@Value("${ragh.myTennisCoach.team}")
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getTeam() {
		return team;
	}
	@Override
	public String getDailyRoutine() {
		return "Do exercise";
	}

	@Override
	public String getFortune() {
		return forturneService.getFortune();
	}

}
