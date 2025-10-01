package com.example.ch8_ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * request param
 * When setting HTTP request parameters, you extends the path with a ? symbol followed by 
 * pairs of key=value parameters separated by the & symbol
 * 
 * http://localhost:8080/home?color=blue
 * http://localhost:8080/home?color=blue&name=Jane
 * 
 * 
 * path variable
 * http://localhost:8080/home/blue
 * */
//adds to spring context
@Controller
public class MainController {
	//to define a path variable, you assign it a name and put it in the path between curly braces
	@RequestMapping("/home/{color}")
	//assign the controller's action to an http request path
	//@RequestMapping("/home")
	//defines a parameter model that stores the data controller sends to the view
	//defines a new parameter for controller's action and annotated it with @Request Param
	//you mark the parameter where you want to get the path variable with the path variable annotation, the name must be the same as the one in curly braces
	public String home(@PathVariable String color, Model page) {
	
	//public String home(Model page) {
	//public String home(@RequestParam String color, Model page) {
	//public String home(@RequestParam String name, @RequestParam String color, Model page) {
		//add data we want the controller to send to the view
		page.addAttribute("username", "Katy");
		//page.addAttribute("username", name);
	//	page.addAttribute("color", "red");
		//The controller passes the color sent by the client to the view
		page.addAttribute("color", color);
		//the controller's action returns the view to be rendered into the http response
		return "home.html";
	}
}
