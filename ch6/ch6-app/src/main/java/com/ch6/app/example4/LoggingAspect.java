package com.ch6.app.example4;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
	private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
	//defines which are the intercepted methods
	@Around("execution(* com.ch6.app.example4.service.*.*(..))")
	public void log(ProceedingJoinPoint joinPoint) throws Throwable {
		//prints a message in the console before the intercepted method's execution
		logger.info("Method will execute");
		//delegates to the actual intercepted method, if you don't call this method, the aspect never delegates to the intercepted method
		joinPoint.proceed();
		//prints a message in the console after the intercepted method's execution
		logger.info("Method executed");
	}
}
