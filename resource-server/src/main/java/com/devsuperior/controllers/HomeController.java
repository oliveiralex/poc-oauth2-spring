package com.devsuperior.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home(Authentication authentication) {
		return "Welcome! " + authentication.getName();
	}
}