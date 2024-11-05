package com.example.ch9_ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/")
	public String loginGet() {
		return "login.html";
	}
}
