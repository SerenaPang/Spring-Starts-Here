package com.ch6.app.example4;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
	private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
	
	@AfterReturning(value = "@annotation(ToLog)", returning = "reutrnedValue")
	public void log(Object reuturnedValue) {
		
		logger.info("Method executed and returned " + reuturnedValue);

	}
}
