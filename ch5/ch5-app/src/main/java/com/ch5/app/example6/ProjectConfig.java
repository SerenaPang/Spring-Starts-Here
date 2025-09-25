package com.ch5.app.example6;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig {
	@Bean
	//if you make the bean prototype scope, that means you are initializing a new instance each time
	@Scope(BeanDefinition.SCOPE_PROTOTYPE) //makes the bean prototype scoped
	public CommentService commentService () {
		return new CommentService();
	}
	
}
