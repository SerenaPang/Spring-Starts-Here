package com.ch2.app;

/**
 * An example to show singleton scope with Beans.xml file
 * */
public class HelloWorld {
	   private String message;

	   public void setMessage(String message){
	      this.message  = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	}