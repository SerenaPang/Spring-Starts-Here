package com.ch5.app.example4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 */
public class App 
{
    public static void main( String[] args )
    {
       var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
    }
}
