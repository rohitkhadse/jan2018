package com.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Car;
import com.hibernate.DealerService;

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
	
	@RequestMapping(value= "/viewcar",method=RequestMethod.GET)
	public ModelAndView viewCar() throws ClassNotFoundException, SQLException{
		List<Car> list = DealerService.displayCar();
		ModelAndView model = new ModelAndView();
		model.addObject("clist",list);
		model.setViewName("display");
		return model;
		
	}
}
