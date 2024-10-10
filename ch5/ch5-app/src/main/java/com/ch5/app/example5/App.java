package com.ch5.app.example5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 */
public class App 
{
    public static void main( String[] args )
    {
       var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
       System.out.println("Before retrieving the CommentService");
       
       var service = c.getBean(CommentService.class); // provide a reference to the CommentService bean, and also creates the instance
       System.out.println("After retrieving the CommentService");
    }
}
