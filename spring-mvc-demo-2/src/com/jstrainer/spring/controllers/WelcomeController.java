package com.jstrainer.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jstrainer.spring.service.GenericWelcomeService;
import com.jstrainer.spring.service.WelcomeService;

@Controller
public class WelcomeController {
	
	@Autowired
	private GenericWelcomeService welcomeService;
	
	@RequestMapping("/")
	public String welcome(Model model)	
	{
		//WelcomeService welcomeService = new WelcomeService();
		
		List<String> welcomeMesssage = welcomeService.getWelcomeMessage("Jeswinder Singh");
		//add data to model.
		model.addAttribute("welcomeMessage", welcomeMesssage);
		//return logical name for view
		return "welcome";
	}
}
