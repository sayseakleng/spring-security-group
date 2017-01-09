package com.kdemo.security.controller;

import java.security.Principal;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/")
	public String getWelcomePage(Model model, Principal principal) {
		
		model.addAttribute("name", principal.getName());
		model.addAttribute("systemDateTime", new Date());
		
		return "welcome";
	}
}
