package com.ch5.app.example2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 */
public class App 
{
    public static void main( String[] args )
    {
       var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
       var s1 = c.getBean(CommentService.class);
       var s2 = c.getBean(UserService.class);
    		   
       boolean b = s1.getCommentRepository() == s2.getCommentRepository();
       System.out.println(b);
    }
}
