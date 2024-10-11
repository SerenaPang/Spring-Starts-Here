package com.ch5.app.example8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ch5.app.CommentService;

/**
 */
public class App {
	public static void main(String[] args) {
		var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var cs1 = c.getBean("commentService", CommentService.class);
		var cs2 = c.getBean("commentService", CommentService.class);
		//The variable cs1 and cs2 always contain reference to two different instances

		boolean b1 = cs1 == cs2;
		System.out.println(b1);
	}
}