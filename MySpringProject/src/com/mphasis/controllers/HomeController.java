package com.mphasis.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mphasis.dao.UserDao;
import com.mphasis.dao.UserDaoImple;
import com.mphasis.model.AdminUsers;
import com.mphasis.model.CompanyDescription;
import com.mphasis.model.CompanyRegistration;
import com.mphasis.model.CompanyUsers;
import com.mphasis.model.JobProfile;
import com.mphasis.model.StudentUsers;
import com.mphasis.security.HashGen;

@Controller
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		return "index";
	}
	@RequestMapping(value="/studentHome", method=RequestMethod.GET)
	public String studentHomeDisplay() {
		return "studentHome";
	}
	@RequestMapping(value="/companyHome", method=RequestMethod.GET)
	public String companyHomeDisplay() {
		return "companyHome";
	}
	@RequestMapping(value="/studentregistrationcompleted", method=RequestMethod.GET)
	public String studentregistrationcompleted() {
		return "studentregistrationsuccess";
	}
	@RequestMapping(value="/adminHome", method=RequestMethod.GET)
	public String adminHomeDisplay() {
		return "adminHome";
	}
	@RequestMapping(value="/companyRegistration", method=RequestMethod.GET)
	public String RegistrationDisplay() {
		return "companyRegistration";
	}
	@RequestMapping(value="/studentRegistration", method=RequestMethod.GET)
	public String studentRegistrationDisplay() {
		return "studentRegistration";
	}
//	@RequestMapping(value="/cdashboard", method=RequestMethod.GET)
//	public String companyDashboardDisplay() {
//	return "CompanyDashboard";
//	}
	@RequestMapping(value="/companyforgotpassword", method=RequestMethod.GET)
	public String companyforgotpassdisp() {
		return "companyforgotpassword";
	}
	@RequestMapping(value="/studentforgotpassword", method=RequestMethod.GET)
	public String studentforgotpassdisp() {
		return "studentforgotpassword";
	}
	@RequestMapping(value="/studentresetpassword", method=RequestMethod.GET)
	public String studentresetpassworddisp() {
		return "studentresetpassword";
	}
	@RequestMapping(value="/companyresetpassword", method=RequestMethod.GET)
	public String companyresetpassworddisp() {
		return "companyresetpassword";
	}
	@RequestMapping(value="/studentresetsuccess", method=RequestMethod.GET)
	public String studentresetsuccessdisp() {
		return "studentHome";
	}
	@RequestMapping(value="/companyresetsuccess", method=RequestMethod.GET)
	public String companyresetsuccessdisp() {
		return "companyHome";
	}
	@RequestMapping(value="/studentresetredirect", method=RequestMethod.GET)
	public String studentresetredirect() {
		return "studentresetsuccess";
	}
	@RequestMapping(value="/companyRegistrationSuccess", method=RequestMethod.POST)
	public String companyregistrationSuccess(CompanyRegistration companyReg) {
		String tempPass=companyReg.getPassword();
		JobProfile job=new JobProfile();
		HashGen hash=new HashGen();
		CompanyUsers userLogin=new CompanyUsers();
		CompanyDescription description=new CompanyDescription();
		userLogin.setPassword(hash.HashCodeGenerator(tempPass));
		userLogin.setUserName(companyReg.getUsername());
		//Login Table Complete
		//TODO
		//CompanyDescription
		description.setCusn(companyReg.getUsername());
		description.setDesc(companyReg.getDescription());
		description.setSecurityAnsOne(companyReg.getSeq1());
		description.setSecurityAnsTwo(companyReg.getSeq2());
		
		return "companyregistrationsuccess";
	}
	@RequestMapping(value="/studentregistrationSuccess", method=RequestMethod.POST)
	public String studentregistrationSuccess() {
		return "studentregistrationsuccess";
	}
	@RequestMapping(value="/loginfailed", method=RequestMethod.GET)
	public String loginfaildisp() {
		return "loginfailed";
	}
@RequestMapping(value="/companyloginprocess",method=RequestMethod.POST)
public String loginProcess(CompanyUsers userPassed) {
	String tempPass=userPassed.getPassword();
	UserDao user=new UserDaoImple();
	List <CompanyUsers> allUsers=user.getCompanyUsers();
	HashGen hash=new HashGen();
	userPassed.setPassword(hash.HashCodeGenerator(tempPass));
	for(CompanyUsers tempUsers:allUsers) {
		boolean isValid=user.isValidCompanyUser(userPassed, tempUsers);
		System.out.println(isValid);
		if(isValid==true) {
			return "CompanyDashboard";
		}
	}
	
	return "loginfailed";
	
}

@RequestMapping(value="/studentloginprocess",method=RequestMethod.POST)
public String studentloginProcess(StudentUsers userPassed) {
	String tempPass=userPassed.getPassword();
	UserDao user=new UserDaoImple();
	List <StudentUsers> allUsers=user.getStudentUsers();
	HashGen hash=new HashGen();
	userPassed.setPassword(hash.HashCodeGenerator(tempPass));
	for(StudentUsers tempUsers:allUsers) {
		boolean isValid=user.isValidStudentUser(userPassed, tempUsers);
		System.out.println(isValid);
		if(isValid==true) {
			return "studentDashboard";
		}
	}
	
	return "loginfailed";
	
}
@RequestMapping(value="/adminloginprocess",method=RequestMethod.POST)
public String AdminLogin(AdminUsers userPassed) {
	
	UserDao user=new UserDaoImple();
	List <AdminUsers> allUsers=user.getAdminUsers();
	for(AdminUsers tempUsers:allUsers) {
		boolean isValid=user.isValidAdminUser(userPassed, tempUsers);
		System.out.println(isValid);
		if(isValid==true) {
			return "CompanyDashboard";
		}
	}
	
	return "loginfailed";
	
}
}
