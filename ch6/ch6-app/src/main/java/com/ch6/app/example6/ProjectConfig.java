package com.ch6.app.example6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.ch6.app.example6"})
@EnableAspectJAutoProxy
public class ProjectConfig {
	//add an instance of the LoggingAspect class to the Spring context
	@Bean 
	public LoggingAspect aspect() {
		return new LoggingAspect();
	}
}
