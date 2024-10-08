package com.ch4.app.example3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 */
public class App {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		
		var comment = new Comment();
		comment.setAuthor("Laurentiu");
		comment.setText("Demo comment");
		
		var commentService = context.getBean(CommentService.class);
		commentService.publicComment(comment);
	}
}
