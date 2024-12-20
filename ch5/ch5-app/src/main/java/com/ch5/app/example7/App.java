package com.ch5.app.example7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 */
public class App {
	public static void main(String[] args) {
		var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var s1 = c.getBean(CommentService.class);
		var s2 = c.getBean(UserService.class); //gets references from the context for the service beans

		boolean b = s1.getCommentRepository() == s2.getCommentRepository();
		System.out.println(b);
	}
}