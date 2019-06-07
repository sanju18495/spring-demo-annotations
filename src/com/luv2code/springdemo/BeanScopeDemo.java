package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
		Coach alphaCoach = context.getBean("thatSillyCoach",Coach.class);
		System.out.println("Pointing to the same object ? : "+(theCoach==alphaCoach));
		System.out.println("The address of theCoach : "+theCoach);
		System.out.println("The address of alphaCoach : "+alphaCoach);
		context.close();
	}

}
