package com.ch6.app.example1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.ch6.app"})
@EnableAspectJAutoProxy
public class ProjectConfig {
	
	@Bean 
	public LoggingAspect apect() {
		return new LoggingAspect();
	}
}
