package com.ch5.app.example8;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig {
	@Bean
	@Scope(BeanDefinition.SCOPE_PROTOTYPE) //makes the bean prototype scoped
	public CommentService commentService () {
		return new CommentService();
	}
	
}
