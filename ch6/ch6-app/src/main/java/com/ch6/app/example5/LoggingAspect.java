package com.ch6.app.example5;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

// Do not use @Component to define the @Aspect, otherwise
// the pointcut method will be executed twice.
@Aspect
public class LoggingAspect {

	private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
	@Around("execution(* com.ch6.app.example5.service.*.*(..))")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
	//	System.out.println("LoggingAspect.log()");
		//obtains name and parameters of the intercepted method
		String MethodName = joinPoint.getSignature().getName();
		Object[] arguments = joinPoint.getArgs();
		
		logger.info("Method " + MethodName + " with parameters " + Arrays.asList(arguments) 
		 + " will execute");

		//calls the intercepted method
		Object returnedByMethod = joinPoint.proceed();
	
		logger.info("Method executed and returned " + returnedByMethod);
	
		return returnedByMethod;
	}
}
