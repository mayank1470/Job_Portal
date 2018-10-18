package com.mphasis.dao;

import java.util.List;

import com.mphasis.model.AdminUsers;
import com.mphasis.model.CompanyUsers;
import com.mphasis.model.StudentUsers;


public interface UserDao {
	public List<CompanyUsers> getCompanyUsers();
	public List<StudentUsers> getStudentUsers();
	public List<AdminUsers> getAdminUsers();
	public boolean isValidCompanyUser(CompanyUsers userPassed,CompanyUsers userReceived);
//	public void addUserCompany(CompanyUsers user,);
	public boolean isValidStudentUser(StudentUsers userPassed,StudentUsers userReceived);
	public boolean isValidAdminUser(AdminUsers userPassed,AdminUsers userReceived);
	
	
}
