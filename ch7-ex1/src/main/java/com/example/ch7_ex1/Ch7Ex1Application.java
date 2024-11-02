package com.example.ch7_ex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.ch7_ex1.controllers"})
public class Ch7Ex1Application {

	public static void main(String[] args) {
		System.out.println("Ch7Ex1Application.main()");
		SpringApplication.run(Ch7Ex1Application.class, args);
		
	}

}
