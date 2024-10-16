package com.ch6.app.example2;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
	private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
	
	@Around("execution(* com.ch6.app.example1.service.*.*(..))")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		String MethodName = joinPoint.getSignature().getName();
		Object[] arguments = joinPoint.getArgs();
		
		logger.info("Method " + MethodName + " with parameters " + Arrays.asList(arguments) 
		 + " will execute");
		
		Object returnedByMethod = joinPoint.proceed();
		
		logger.info("Method executed and returned " + returnedByMethod);
		
		return returnedByMethod;
	}
}
