package com.mphasis.jobportal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


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
	@RequestMapping(value="/cdashboard", method=RequestMethod.GET)
	public String companyDashboardDisplay() {
	return "CompanyDashboard";
	}
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
}