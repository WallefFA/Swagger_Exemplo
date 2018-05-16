package com.ais.swagger.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeResource {
	
	@GetMapping(produces="application/json")
	public String home() {
		return "Welcome to application!";
	}
}
