package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	@Value("${email}")
	private String email;
	@Value("${team}")
	private String team;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public SwimCoach(FortuneService fortuneService) {
		System.out.println("Inside SwimCoach constructor");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "swim for 15 mins";
	}

	@Override
	public String dailyFortune() {
		return fortuneService.getFortune();
	}

}
