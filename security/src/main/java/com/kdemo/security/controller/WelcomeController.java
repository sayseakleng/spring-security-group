package com.kdemo.security.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/")
	public String getWelcomePage(Model model) {
		
		model.addAttribute("name", "Lan");
		model.addAttribute("systemDateTime", new Date());
		
		return "welcome";
	}
}
