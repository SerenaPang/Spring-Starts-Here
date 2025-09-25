package com.ch5.app.example4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 */
public class App 
{
    public static void main( String[] args )
    {
       var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
       System.out.println("Before Retrieving the comment service");
       var service = c.getBean(CommentService.class);
       System.out.println("After retrieving the CommentService");
    }
}
