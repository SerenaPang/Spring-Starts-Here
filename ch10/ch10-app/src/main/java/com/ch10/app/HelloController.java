package com.ch10.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//mark the class as a spring mvc controller
//@Controller
//mark it as the rest  endpoint
@RestController
public class HelloController {
	
	//curl http://localhost:8080/hello
	//specify get request curl -X GET http://localhost:8080/hello
	//get more details curl -v http://localhost:8080/hello
	//use the get mapping annotation to associate the get http method with the the controller's action
	@GetMapping("/hello")
	//use the annotation to inform the dispatcher servlet that this method doesn't return a view name but the http response directly
	//@ResponseBody
	public String hello() {
		return "Hello!";
	}
	
	
	@GetMapping("/ciao")
	//@ResponseBody
	public String ciao() {
		return "Ciao!";
	}

}
