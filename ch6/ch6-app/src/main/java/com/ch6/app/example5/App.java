package com.ch6.app.example5;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.ch6.app.example5.service.CommentService;

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

		service.publicComment(comment);
		String value = service.publicComment(comment);

		logger.info(value);
	}
}
