package com.example.ch9_ex;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

//use stereotype annotation to tell spring this is a bean
@Component
//use request scope annotation to change the bean scope to request scope, so spring creates a new instance of the class for every HTTP request
@RequestScope
public class LoginProcessor {
	// the bean stores the credential as attributes
	private String username;
	private String password;

	// The bean defines a method for implementing the login logic
	public boolean login() {
		String username = this.geUsername();
		String password = this.getPassword();

		if ("natalie".equals(username) && "password".equals(password)) {
			return true;
		} else {
			return false;
		}
	}

	private String getPassword() {
		return password;
	}

	private String geUsername() {
		return username;
	}
}
