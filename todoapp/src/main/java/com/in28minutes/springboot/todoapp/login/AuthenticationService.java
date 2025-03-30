package com.in28minutes.springboot.todoapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean isAuthenticated(String username, String password) {
        boolean isValidUsername = username.equalsIgnoreCase("name");
        boolean isValidPassword = password.equalsIgnoreCase("pass");
        return isValidUsername && isValidPassword;
    }
}
