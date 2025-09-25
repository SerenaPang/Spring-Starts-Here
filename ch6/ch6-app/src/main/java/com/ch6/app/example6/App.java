package com.ch6.app.example6;

import java.util.logging.Logger;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//6.8 TODO fix the printing parameters and method name
public class App {
	private static Logger logger = Logger.getLogger(App.class.getName());
	public static void main(String[] args) {		
		try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
			var service = c.getBean(CommentService.class);

			Comment comment = new Comment();
			comment.setText("Demo comment");
			comment.setAuthor("Natasha");
		//	service.publicComment(comment);
			
		//	System.out.println("Analyzing delete method");
		//	System.out.println("-------------------------------");
		//	service.deleteComment(comment);
			String value = service.publishComment(comment);
			//prints the value returned by the publishComment method
			logger.info(value);
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
