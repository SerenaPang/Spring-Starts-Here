package com.ch6.app.example6.service;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(@ElementType.METHOD)
public @interface ToLog {

}
