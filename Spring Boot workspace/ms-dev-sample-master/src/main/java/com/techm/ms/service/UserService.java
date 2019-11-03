package com.techm.ms.service;

import java.util.List;

import com.techm.ms.model.User;

public interface UserService {
	
	void createUser(User user);
	
	List<User> getAllUsers();
	
	User getUser(long id);
}
