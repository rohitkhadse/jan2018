package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarHandler {
	
	@RequestMapping(value= "/carlist",method=RequestMethod.GET)
	public String getCarList(){
		return "carlist"; //this is jsp file name
	}

	@RequestMapping(value= "/add",method=RequestMethod.POST)
	public String add(@RequestParam("carname") String carName){
		System.out.print("Name :" + carName);
		return "carlist"; 
	}
}
