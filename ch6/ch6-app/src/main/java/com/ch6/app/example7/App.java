package com.ch6.app.example7;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 6.9
 */
public class App 
{
    public static void main( String[] args )
    {
    	try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
			var service = c.getBean(CommentService.class);

			Comment comment = new Comment();
			comment.setText("Demo comment");
			comment.setAuthor("Natasha");
		//	service.publicComment(comment);
			
		//	System.out.println("Analyzing delete method");
		//	System.out.println("-------------------------------");
		//	service.deleteComment(comment);
			// service.publishComment(comment);
			 service.deleteComment(comment);
			//service.editComment(comment);
			 
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
