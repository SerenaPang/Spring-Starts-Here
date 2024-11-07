package com.example.ch9_ex2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/")
	public String loginGet() {
		return "login.html";
	}
}
