package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDAO;

	public void setUserDAO(UserDao userDAO) {
		this.userDAO = userDAO;
	}

	public boolean validate(String name, String pass) {
		// TODO Auto-generated method stub
		return this.userDAO.validate(name, pass);
	}

}
