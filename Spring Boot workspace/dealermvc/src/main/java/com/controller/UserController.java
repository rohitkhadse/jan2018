package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private UserService userServie;
	
	public void setUserServie(UserService userServie) {
		this.userServie = userServie;
	}


	@RequestMapping(value= "/validate",method=RequestMethod.POST)
	public ModelAndView validate(@RequestParam("username") String name,
			@RequestParam("password") String pass){
		if(this.userServie.validate(name, pass)){
			
		}
		ModelAndView model = new ModelAndView();
		return model;
	}

}
