package com.ch10.app;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//mark the c;ass as a REST controller to add a bean in the spring context and also inform the dispatcher servlet 
//not to look for a view when this method returns
@RestController
public class CountryController {
	//mapping the controller's action to the http get method and /france path
//	@GetMapping("/france")
//	public Country france() {
//		Country c = Country.of("France", 67);
//		//return an instance of type Country
//		return c;
//	}
	
	@GetMapping("/france")
	public ResponseEntity<Country> france(){
		Country c = Country.of("France", 67);
		//change the http response sttaus to 202 accepted
		return ResponseEntity.status(HttpStatus.ACCEPTED)
				//adds 3 custom header to the response
				.header("continent", "Europe")
				.header("capital", "Paris")
				.header("favourite_food", "cheese and wine")
				//sets the response body
				.body(c);
	}
	
	@GetMapping("/all")
	public List<Country> countries(){
		Country c1 = Country.of("France", 67);
		Country c2 = Country.of("Spain", 47);
		return List.of(c1, c2);
	}
}
