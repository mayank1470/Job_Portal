package com.mphasis.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mphasis.model.AdminUsers;
import com.mphasis.model.CompanyUsers;
import com.mphasis.model.StudentUsers;
import com.mphasis.myutils.MyUtility;

public class UserDaoImple implements UserDao {

	@Override
	public List<CompanyUsers> getCompanyUsers() {
		List<CompanyUsers> users ;
		Session session=MyUtility.getMySessionFactory().openSession();
		 session.getTransaction().begin();
		 users = (List<CompanyUsers>)session.createQuery("from CompanyUsers s").list();
		 System.out.println("This is User returned"+users);
	
		return users;
	}

	@Override
	public boolean isValidCompanyUser(CompanyUsers userPassed,CompanyUsers usersReceived) {
		if(userPassed.getUserName().equals(usersReceived.getUserName())&&userPassed.getPassword().equals(usersReceived.getPassword())) {
			return true;
		}else {
			return false;
			
		}
		
		
	}

	@Override
	public List<StudentUsers> getStudentUsers() {
		// TODO Auto-generated method stub
		List<StudentUsers> users ;
		Session session=MyUtility.getMySessionFactory().openSession();
		 session.getTransaction().begin();
		 users = (List<StudentUsers>)session.createQuery("from StudentUsers s").list();
		 System.out.println("This is User returned"+users);
	
		return users;
	}

	@Override
	public List<AdminUsers> getAdminUsers() {
		// TODO Auto-generated method stub
		List<AdminUsers> users ;
		Session session=MyUtility.getMySessionFactory().openSession();
		 session.getTransaction().begin();
		 users = (List<AdminUsers>)session.createQuery("from AdminUsers s").list();
		 System.out.println("This is User returned"+users);
	
		return users;
	}

	@Override
	public boolean isValidStudentUser(StudentUsers userPassed, StudentUsers userReceived) {
		// TODO Auto-generated method stub
		if(userPassed.getUserName().equals(userReceived.getUserName())&&userPassed.getPassword().equals(userReceived.getPassword())) {
			return true;
		}else {
			return false;
			
		}
		
	}

	@Override
	public boolean isValidAdminUser(AdminUsers userPassed, AdminUsers userReceived) {
		// TODO Auto-generated method stub
		if(userPassed.getUserName().equals(userReceived.getUserName())&&userPassed.getPassword().equals(userReceived.getPassword())) {
			return true;
		}else {
			return false;
			
		}
		
	}

	
}
