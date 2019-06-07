package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach") // if we dont mention bean-id explicitly, the
// default will be classname starting with a
// lowercase
//@Scope("prototype")
public class CricketCoach implements Coach {
	
	@Value("${email}")
//	@Autowired
	private String emailAddress;
	@Value("${team}")
	private String teamName;
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public CricketCoach() {
		System.out.println("Inside cricketCoach defualt constructor");
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	/* this is method autowiring */
	/*
	 * public void anyMethodName(FortuneService fortuneService) {
	 * System.out.println("Inside method autowiring"); this.fortuneService =
	 * fortuneService; }
	 */

	/* this is setter injection */
	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * System.out.println("Inside cricket coach : setFortuneService");
	 * this.fortuneService = fortuneService; }
	 */

	/* this is constructor injection */
	/*
	 * @Autowired public CricketCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("insdie setter method - emailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		System.out.println("insdie setter method - teamName");
		this.teamName = teamName;
	}

	@Override
	public String getDailyWorkOut() {
		return "practice fast bowling";
	}

	@Override
	public String dailyFortune() {
		return fortuneService.getFortune();
	}

	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Doing the startup stuff");
	}

	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("Doing the cleanup stuff");
	}

}
