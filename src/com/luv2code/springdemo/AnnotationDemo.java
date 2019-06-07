package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach theCoach = context.getBean("thatSillyCoach", CricketCoach.class);
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.dailyFortune());
		System.out.println(theCoach.getEmailAddress());
		context.close();
	}

}
