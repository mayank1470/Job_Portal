package com.mphasis.security;

import com.mphasis.project.Users;

public class ValidUser {
	public boolean ValidateUser(Users userReceived, Users userPassed) {
		if(userReceived.getUserName().equals(userPassed.getUserName())&& userReceived.getPassword().equals(userPassed.getPassword())) {
			return true;
		}
		return false;
	}
}
