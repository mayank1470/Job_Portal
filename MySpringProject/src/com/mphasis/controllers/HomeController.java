package com.mphasis.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mphasis.dao.UserDao;
import com.mphasis.dao.UserDaoImple;
import com.mphasis.model.CompanyUsers;
import com.mphasis.security.HashGen;

@Controller
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		return "home";
	}
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String homedisplay() {
		return "home";
	}
	@RequestMapping(value="/companyRegistration", method=RequestMethod.GET)
	public String RegistrationDisplay() {
		return "companyRegistration";
	}
//	@RequestMapping(value="/cdashboard", method=RequestMethod.GET)
//	public String companyDashboardDisplay() {
//	return "CompanyDashboard";
//	}
	@RequestMapping(value="/forgotpassword", method=RequestMethod.GET)
	public String forgotpassdisp() {
		return "forgotpassword";
	}
	@RequestMapping(value="/resetpassword", method=RequestMethod.GET)
	public String resetpassworddisp() {
		return "resetpassword";
	}
	@RequestMapping(value="/resetsuccess", method=RequestMethod.GET)
	public String resetsuccessdisp() {
		return "resetsuccess";
	}
	@RequestMapping(value="/loginfailed", method=RequestMethod.GET)
	public String loginfaildisp() {
		return "loginfailed";
	}
	@RequestMapping(value="/loginprocess",method=RequestMethod.POST)
	public String loginprocess(CompanyUsers userPassed) {
			UserDao users=new UserDaoImple();
			HashGen hash=new HashGen();
			
			List<CompanyUsers> usersReceived=users.getUsers();
			for(CompanyUsers tempUsers:usersReceived) {
				System.out.println(tempUsers);
				String tempPassword=tempUsers.getPassword();
				tempUsers.setPassword(hash.HashCodeGenerator(tempPassword));
				boolean flag=users.ValidUser(userPassed, tempUsers);
				if(flag==true) {
					return "CompanyDashBoard";
				}
			}
		return "loginFailed";	
}
}

