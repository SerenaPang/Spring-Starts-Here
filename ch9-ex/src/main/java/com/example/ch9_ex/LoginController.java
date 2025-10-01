package com.example.ch9_ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
 
	//map the controller's action  to the root"/"path of the app
  @GetMapping("/")
  public String loginGet() {
    return "login.html";
  }
  
//mapping the controller's action to the http post request of the login page 
  @PostMapping("/")
  public String loginPost(
      @RequestParam String username,
      @RequestParam String password,
      Model model // the model parameter sends the message value to the view
  ) {
	  //when we later implement the login logic, this variable will store the login request result
    boolean loggedIn = true;
 
    //depends on the result of the login, we send a specific message to the view
    if (loggedIn) {
      model.addAttribute("message", "You are now logged in.");
    } else {
      model.addAttribute("message", "Login failed!");
    }
    //we return the view name, still login.html so we remain on the same page
    return "login.html";
  }
}
