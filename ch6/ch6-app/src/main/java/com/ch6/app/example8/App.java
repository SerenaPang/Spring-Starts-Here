package com.ch6.app.example8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The security is first to intercept the method call and delegates further in the execution chain tp Loogin aspect
 * The logging aspect executes and delegates further to the intercepted method
 * The intercepted method executes and returns to the logging aspect
 * The Logging Aspect executes and return to the Security aspect
 * 
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
      
   //   System.out.println(service.getClass());
    }
}
