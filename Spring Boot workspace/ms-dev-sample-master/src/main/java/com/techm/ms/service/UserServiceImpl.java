package com.techm.ms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.techm.ms.model.User;

@Service
public class UserServiceImpl implements UserService{

	private static final AtomicLong counter = new AtomicLong();
	
	private static List<User> users;
	
	static{
		users = dummyUsers();
		
	}

	@Override
	public void createUser(User user) {
		counter.incrementAndGet();
		users.add(user);
		
	}

	@Override
	public List<User> getAllUsers() {
		return users;
	}
	
	private static List<User> dummyUsers() {
		users = new ArrayList<User>();
		users.add(new User(counter.incrementAndGet(),"user1",34,1));
		users.add(new User(counter.incrementAndGet(),"user2",44,2));
		return users;
	}

	@Override
	public User getUser(long id) {
		User u = null;
		for(User user : users){
			if(user.getId() == id)
				u = user;
		}
		
		if(u == null){
			System.out.println("User with "+id+" not found");
		}
		return u;
	}

}
