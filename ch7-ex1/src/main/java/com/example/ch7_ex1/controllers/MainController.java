package com.example.ch7_ex1.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MainController {
	
	// http://localhost:8080/home
	@RequestMapping("/home")
	public String home() {
		return "home.html";
	}
}
