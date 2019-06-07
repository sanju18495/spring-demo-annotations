package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String data[] = { "Journey is the reward", "Nothing can replace hard work",
			"Beware of the wolf in sheep's clothing" };

	private Random myRandomNumber = new Random();
	@Override
	public String getFortune() {
		return data[myRandomNumber.nextInt(data.length)];
	}

}
