package com.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Car;
import com.hibernate.DealerService;
import com.service.CarService;

@Controller
@RequestMapping("/car")
public class CarHandler {
	
	@Autowired
	private CarService carService;
	
	
	public void setCarService(CarService carService) {
		this.carService = carService;
	}

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
		List<Car> list = this.carService.displayCar();
		ModelAndView model = new ModelAndView();
		model.addObject("clist",list);
		model.setViewName("display");
		return model;
		
	}
	
}
