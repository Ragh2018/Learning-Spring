package com.ragh.springdemo.coach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.ragh.springdemo.fortune.FortuneService;

@Component
@Scope("prototype")
public class TennisCoach implements Coach,DisposableBean {

	//Field Injection
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	// As of Spring Framework 4.3, an @Autowired annotation on such a constructor is
	// no longer necessary if the target bean only defines one constructor to begin
	// with. However, if several constructors are available, at least one must be
	// annotated to teach the container which one to use.
	
	//Constructor Injection
	/*
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.forturneService = fortuneService; }
	 */
	//Setter Injection
	/*
	 * @Autowired public void setForturneService(FortuneService fortuneService) {
	 * this.forturneService=fortuneService; }
	 */
	
	//init method
	@PostConstruct
	public void init()
	{
		System.out.println("Inside init");
	}
	//destroy method
	@Override
	@PreDestroy
	public void destroy()
	{
		System.out.println("Inside destroy");
	}
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
		return fortuneService.getFortune();
	}

}
