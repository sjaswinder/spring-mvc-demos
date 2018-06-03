package com.jstrainer.spring.service;

import java.util.List;
import java.util.ArrayList;

public class WelcomeService implements GenericWelcomeService {
	public List<String> getWelcomeMessage(String name) {
		List<String> myWelcomeMessage = new ArrayList<>();
		
		myWelcomeMessage.add("Hello! ");
		myWelcomeMessage.add(name);
		myWelcomeMessage.add("Welcome to Spring MVC sessions.");
		
		
		return myWelcomeMessage;
	}
}
