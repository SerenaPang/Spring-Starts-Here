package com.ch6.app.example0;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration

public class ProjectConfig {
	
	@Bean 
	public CommentService commentService() {
		return new CommentService();
	}
}
