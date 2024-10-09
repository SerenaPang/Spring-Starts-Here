package com.ch5.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 */
public class App 
{
    public static void main( String[] args )
    {
       var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
       var cs1 = c.getBean("commentService", CommentService.class);
       var cs2 = c.getBean("commentService", CommentService.class);
    		   
       boolean b1 = cs1 ==cs2;
       System.out.println(b1);
    }
}
