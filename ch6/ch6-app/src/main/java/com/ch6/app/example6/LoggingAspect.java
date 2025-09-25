package com.ch6.app.example6;

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
//	public void log() {
//		
//	}
	
	//defines in which package are the intercepted methods
	//TODO
	//@Around("execution(* com.ch6.app.example6.*.*(..))")
	@Around("execution(* com.ch6.app.example6.CommentService.*(..))")
	//@Around("execution(* example6.*.*(..))")
	//public void log(ProceedingJoinPoint joinPoint) throws Throwable  {
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable  {
		//get method name and parameters before intercepting the call
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
		
		return "Failed";
		//returns the value returned by the intercepted method
		//return returnedByMethod;
		//logger.info("Method will execute");
		//delegates to the actual intercepted method
		//joinPoint.proceed();
		//prints a message in the console after the intercepted method's execution
		//logger.info("Method executed");
	}

//	@Around(value = "@annotation(ToLog)")
//	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
//		System.out.println("LoggingAspect.log()");
//		//obtains name and parameters of the intercepted method
//		String MethodName = joinPoint.getSignature().getName();
//		Object[] arguments = joinPoint.getArgs();
//		
//		System.out.println("Method " + MethodName + " with parameters " + Arrays.asList(arguments) 
//		 + " will execute");
//
//		Comment comment = new Comment();
//		comment.setText("Some other text!");
//		Object[] newArguments = {comment};
//
//		System.out.println("Calling " + MethodName + " with new parameters");
//		//calls the intercepted method
//		Object returnedByMethod = joinPoint.proceed(newArguments);
//	
//		System.out.println("Method executed and returned " + returnedByMethod);
//	
//		return returnedByMethod;
//	}
}
