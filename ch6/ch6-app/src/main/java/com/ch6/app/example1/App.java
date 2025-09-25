package com.ch6.app.example1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 */
public class App 
{
    public static void main( String[] args )
    {
      var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
      //gets bean from spring context
      var service = c.getBean(CommentService.class);
      
      //creates a comment instance to give as a parameter for the method
      Comment comment = new Comment();
      comment.setText("Demo comment");
      comment.setAuthor("Natasha");
      //call the method
      service.publicComment(comment);
    }
}
