package com.hibernate;


import java.sql.SQLException;
import java.util.List;
import org.hibernate.Criteria;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import com.entity.Car;
import com.entity.User;

public class DealerService {

	public static boolean validate(String name, String pass) {
		boolean status = false;

		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();

		@SuppressWarnings("deprecation")
		Criteria cr = session.createCriteria(User.class);
		cr.add(Restrictions.eq("username", name));
		cr.add(Restrictions.eq("password", pass));

		List<User> user = cr.list();
		if (user.isEmpty()) {
			status = false;
		} else {
			status = true;
		}

		session.getTransaction().commit();
		return status;

	}

	public static List<Car> displayCar() throws SQLException, ClassNotFoundException {

		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();

//		Query query = session.createQuery("from car");
//		List<Car> list =((Criteria) query).list(); 
		Criteria cr = session.createCriteria(Car.class);
		List<Car> carlist = cr.list();
		
		session.getTransaction().commit();

		return carlist;
	}

}
