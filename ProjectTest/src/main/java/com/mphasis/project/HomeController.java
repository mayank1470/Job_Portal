package com.mphasis.project;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mphasis.security.HashGen;
import com.mphasis.security.ValidUser;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String showHome() {
		return "index";
		
	}
	@RequestMapping(value="/companyLogin",method=RequestMethod.POST)
	public String loginProcess(Users userReceived) {
		HashGen hash=new HashGen();
		String tempPassword=userReceived.getPassword();
		userReceived.setPassword(hash.SHAGen(tempPassword));
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(Users.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		session.getTransaction().begin();
		List<Users> list=session.createQuery("from Users").list();
		session.getTransaction().commit();
		for(Users tempUser:list) {
			ValidUser valid=new ValidUser();
			boolean validate= valid.ValidateUser(userReceived, tempUser);
			if(validate==true) {
				System.out.println(userReceived.getUserName());
				System.out.println(userReceived.getPassword());
				return "loginsuccess";
			}else {
				return "loginFailed";
			}
			
		}
//		return "loginsuccess";
		return "loginFailed";
	}
	@RequestMapping(value="/companyDashboard",method=RequestMethod.GET)
	public String displayCompanyDashboard() {
		return "companyDashboard";
	}
}