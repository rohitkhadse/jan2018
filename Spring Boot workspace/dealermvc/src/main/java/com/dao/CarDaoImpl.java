package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.entity.Car;
import com.entity.User;
import com.hibernate.HibernateUtility;

@Repository
public class CarDaoImpl implements CarDao{

	public List<Car> displayCar() {
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		
		Criteria cr = session.createCriteria(Car.class);
		List<Car> carlist = cr.list();
		
		session.getTransaction().commit();
		return carlist;
	}
	
}
