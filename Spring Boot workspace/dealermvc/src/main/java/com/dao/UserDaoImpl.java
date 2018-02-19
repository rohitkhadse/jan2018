package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.entity.User;
import com.hibernate.HibernateUtility;

@Repository
public class UserDaoImpl implements UserDao{

	@SuppressWarnings("deprecation")
	public boolean validate(String name, String pass) {
		boolean status = false;
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();

		Criteria cr = session.createCriteria(User.class);
		cr.add(Restrictions.eq("username", name));
		cr.add(Restrictions.eq("password", pass));

		@SuppressWarnings("unchecked")
		List<User> user = cr.list();
		if (user.isEmpty()) {
			status = false;
		} else {
			status = true;
		}

		session.getTransaction().commit();
		return status;

	}


}
