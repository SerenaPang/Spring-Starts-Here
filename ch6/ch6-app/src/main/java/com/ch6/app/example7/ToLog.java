package com.ch6.app.example7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// enables the anotation to be intercepted at runtime
@Retention(RetentionPolicy.RUNTIME)
//restricts this annotation to only be used with methods
@Target(ElementType.METHOD)
public @interface ToLog {

}
