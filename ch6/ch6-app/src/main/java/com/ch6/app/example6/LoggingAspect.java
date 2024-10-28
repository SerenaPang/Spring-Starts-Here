package com.ch6.app.example6;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

// Do not use @Component to define the @Aspect, otherwise
// the pointcut method will be executed twice.
@Aspect
public class LoggingAspect {

	@Around(value = "@annotation(ToLog)")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("LoggingAspect.log()");
		//obtains name and parameters of the intercepted method
		String MethodName = joinPoint.getSignature().getName();
		Object[] arguments = joinPoint.getArgs();
		
		System.out.println("Method " + MethodName + " with parameters " + Arrays.asList(arguments) 
		 + " will execute");

		Comment comment = new Comment();
		comment.setText("Some other text!");
		Object[] newArguments = {comment};

		System.out.println("Calling " + MethodName + " with new parameters");
		//calls the intercepted method
		Object returnedByMethod = joinPoint.proceed(newArguments);
	
		System.out.println("Method executed and returned " + returnedByMethod);
	
		return returnedByMethod;
	}
}
