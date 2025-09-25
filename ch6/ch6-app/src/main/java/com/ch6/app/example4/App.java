package com.ch6.app.example4;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 */
public class App {
	private static Logger logger = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {
		var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var service = c.getBean(CommentService.class);

		Comment comment = new Comment();
		comment.setText("Demo comment");
		comment.setAuthor("Natasha");

		String value = service.publicComment(comment);

		logger.info(value);

	}
}
