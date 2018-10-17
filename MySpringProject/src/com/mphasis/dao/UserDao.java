package com.mphasis.dao;

import java.util.List;

import com.mphasis.model.CompanyUsers;


public interface UserDao {
	public List<CompanyUsers> getUsers();
	public boolean ValidUser(CompanyUsers userPassed,CompanyUsers userReceived);
	
	
	
}
