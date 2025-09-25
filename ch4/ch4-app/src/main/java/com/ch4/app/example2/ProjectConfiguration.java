package com.ch4.app.example2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//use component scan to tell spring which package to search for the classes with stereotype annotation
@ComponentScan(basePackages = {"com.ch4.app.example2"})
public class ProjectConfiguration {
	
}
