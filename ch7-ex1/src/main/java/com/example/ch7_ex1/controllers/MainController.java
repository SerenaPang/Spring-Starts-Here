package com.example.ch7_ex1.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MainController {
	
	//http://localhost:8080/home
	//use the annotation to associate the action with an http request path
	@RequestMapping("/home")
	public String home() {
		return "home.html";
	}
}
