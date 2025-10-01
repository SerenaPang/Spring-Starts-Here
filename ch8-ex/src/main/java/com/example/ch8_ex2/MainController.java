package com.example.ch8_ex2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@Controller
public class MainController {

	@RequestMapping("/home")
	public String home(@RequestParam String username, @RequestParam String color, Model page) {
		System.out.println("The username is " + username);
		System.out.println("The color is " + color);
		page.addAttribute("myusername", username);
		page.addAttribute("mycolor", color);
		return "home2.html";
	}
}
