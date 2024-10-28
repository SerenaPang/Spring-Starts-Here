package com.ch6.app.example6;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.ch6.app.example6.service.CommentService;


public class App {
	public static void main(String[] args) {
		try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
			var service = c.getBean(CommentService.class);

			Comment comment = new Comment();
			comment.setText("Demo comment");
			comment.setAuthor("Natasha");
			service.publicComment(comment);
			
			System.out.println("Analyzing delete method");
			System.out.println("-------------------------------");
			service.deleteComment(comment);
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
