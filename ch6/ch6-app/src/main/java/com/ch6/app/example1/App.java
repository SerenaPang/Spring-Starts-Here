package com.ch6.app.example1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ch6.app.example1.service.CommentService;

/**
 */
public class App 
{
    public static void main( String[] args )
    {
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
