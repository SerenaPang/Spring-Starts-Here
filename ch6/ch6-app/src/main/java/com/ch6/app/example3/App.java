package com.ch6.app.example3;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 */
public class App {

	public static void main(String[] args) {
		try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
			var service = c.getBean(CommentService.class);

			Comment comment = new Comment();
			comment.setText("Demo comment");
			comment.setAuthor("Natasha");

			service.publicComment(comment);

			System.out.println(service.getClass());
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
