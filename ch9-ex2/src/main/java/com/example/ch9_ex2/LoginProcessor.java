package com.example.ch9_ex2;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {
 
  private String username;
  private String password;
 
  public boolean login() {
    String username = this.getUsername();
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

private String getUsername() {
	return username;
}
 
}
