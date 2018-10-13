package com.mphasis.controllers;

   import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;

	import com.mphasis.dao.MyDaoImple;
	import com.mphasis.model.User;
	import com.mphasis.myutility.MyUtility;
	
	@Controller
	public class MyController {
		private User user=null;
		
		
		
	@RequestMapping(value="/success",method=RequestMethod.POST)
	public String getMe(Model model,User user){
		System.out.println(MyUtility.getMydataSource());
		this.user=user;
		User user1=new MyDaoImple().getUser(user.getUsername());
		if(user1==null){
		model.addAttribute("something",user);
		return "LoginFailure";
		}else{
			model.addAttribute("something",user);
			return "CompanyRegitrationForm";
		}
		
	}
	}

