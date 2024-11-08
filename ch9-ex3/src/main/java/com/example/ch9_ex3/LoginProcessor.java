package com.example.ch9_ex3;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {

	private final LoggedUserManagementService loggedUserManagementService;

	private String username;
	private String password;

	public LoginProcessor(LoggedUserManagementService loggedUserManagementService) {
		this.loggedUserManagementService = loggedUserManagementService;
	}

	public boolean login() {
		String username = this.getUsername();
		String password = this.getPassword();

		boolean loginResult = false;
		if ("natalie".equals(username) && "password".equals(password)) {
			loginResult = true;
			loggedUserManagementService.setUsername(username);
		}

		return loginResult;
	}

	private String getPassword() {
		return password;
	}

	private String getUsername() {
		return username;
	}

	public LoggedUserManagementService getLoggedUserManagementService() {
		return loggedUserManagementService;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
