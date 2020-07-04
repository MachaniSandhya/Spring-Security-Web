package com.vz.security.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	public HomeController(){
		System.out.println("Object created");
	}

	@RequestMapping(value = "/home")
	public String home() {
		System.out.println("home()");
		System.out.println("home()_1");
		ModelAndView mav = new ModelAndView("home");
		return "home";
	}

}
