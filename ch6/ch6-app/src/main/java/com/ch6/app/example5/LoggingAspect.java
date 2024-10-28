package com.ch6.app.example5;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
	private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
	
	@Around("execution(* com.ch6.app.example5.service.*.*(..))")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		//obtains name and params of the intercepted method
		String methodName = joinPoint.getSignature().getName();
		Object[] arguments = joinPoint.getArgs();
		
		logger.info("Method " + methodName + " with parameters " + Arrays.asList(arguments) 
		 + " will execute");
		Comment comment = new Comment();
		comment.setText("Some other text!");
		Object[] newArguments = {comment};
		//calls the intercepted method
		Object returnedByMethod = joinPoint.proceed(newArguments);
		
		logger.info("Method executed and returned " + returnedByMethod);
		//return a different value to the caller
		return "FAILED";
	}
}
