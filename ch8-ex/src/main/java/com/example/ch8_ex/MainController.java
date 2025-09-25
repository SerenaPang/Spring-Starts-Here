package com.example.ch8_ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//adds to spring context
@Controller
public class MainController {
//	@RequestMapping("/home")
	public String home(Model page) {
		page.addAttribute("username", "Katy");
		page.addAttribute("color", "red");
		return "home.html";
	}
}
