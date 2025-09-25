package com.ch4.app.example3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//because we don't use the stereotype annotation, we don't need to use the component scan
@Configuration
public class ProjectConfiguration {
	//create bean for each of the dependencies
	@Bean
	public CommentRepository commentRepository() {
		return new DBCommentRepository();
	}
	
	@Bean
	public CommentNotificationProxy commentNotificationProxy() {
		return new EmailCommentNotificationProxy();
	}
	
	@Bean
	public CommentService commentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
		return new CommentService(commentRepository, commentNotificationProxy);
	}
}
