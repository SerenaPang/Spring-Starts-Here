package com.ch6.app.example7;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class LoggingAspect {
	private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
	
//	@Around("@annotation(ToLog)")
	//The parameter name is the same as the annotation returning attribute
	//
	@AfterReturning(value = "@annotation(ToLog)", returning = "returnedValue")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
		
		String methodName = joinPoint.getSignature().getName();
		Object[] arguments = joinPoint.getArgs();
		
		logger.info("Method " + methodName + " with parameters " + Arrays.asList(arguments) + " will execute");
		
	//	Object returnedByMethod = joinPoint.proceed();
	//	Object returnedByMethod = joinPoint.proceed();
	//	logger.info("Method executed and returned " + returnedByMethod);
		Comment comment = new Comment();
		comment.setText("Some other text!");
		Object[] newArguments = {comment};
		Object returnedByMethod = joinPoint.proceed(newArguments);
		//we send a different comment instance as a value to the method's parameter
		logger.info("Method executed and returned " + returnedByMethod);
		
		//return "Success";
		return null;
	}
}
