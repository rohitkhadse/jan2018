package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CarDao;
import com.entity.Car;

@Service
public class CarServiceImpl implements CarService{

	@Autowired
	private CarDao carDAO;
	
	
	public void setCarDao(CarDao carDAO){
		this.carDAO = carDAO;
	}
	
	
	public List<Car> displayCar() {
		return this.carDAO.displayCar();
	}


	

}
