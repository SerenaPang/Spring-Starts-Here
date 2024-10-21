package com.ch6.app.example6;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ch6.app.example1.Comment;
import com.ch6.app.example1.ProjectConfig;
import com.ch6.app.example1.service.CommentService;
//import com.ch6.app.example2.service.CommentService;
import com.sun.tools.javac.Main;

/**
 */
public class App {
	private static Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		   var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
		      var service = c.getBean(CommentService.class);
		      
		      Comment comment = new Comment();
		      comment.setText("Demo comment");
		      comment.setAuthor("Natasha");
		      
		      service.publicComment(comment);
		      
		      System.out.println(service.getClass());
		      
		      System.out.println("-----------------------------------------");
		      System.out.println(service.getSecretMessage());
	}
}
