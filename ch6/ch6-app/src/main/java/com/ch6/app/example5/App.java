package com.ch6.app.example5;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * case 6.8
 */
public class App {
	private static Logger logger = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {
		var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
		// gets the bean from the context
		var service = c.getBean(CommentService.class);
		// creates a Comment instance to give as a parameter
		Comment comment = new Comment();
		comment.setText("Demo comment");
		comment.setAuthor("Natasha");
		// calls the method
		String value = service.publicComment(comment);
		logger.info(value);
	}
}
