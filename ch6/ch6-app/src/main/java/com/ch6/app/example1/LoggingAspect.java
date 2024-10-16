package com.ch6.app.example1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
	@Around("execution(* com.ch6.app.example1.service.*.*(..))")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("LoggingAspect.log( - Call implicitly (Not explicitly)");
		Object result = joinPoint.proceed();
	
		System.out.println("LoggingAspect.log() - Returns " + result);
		return result;
	}
}
