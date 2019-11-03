package com.techm.ms.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import com.techm.ms.model.User;
import com.techm.ms.model.representation.ResourceCollection;
import com.techm.ms.service.UserService;

@Controller
public class UserResourceImpl implements UserResource {

	@Autowired
	UserService userService;
	
	private static String baseUrl = "/users";
	
	@Override
	public void createUser(User user) {
		 userService.createUser(user);	
	}

	@Override
	public Response getAllUsers() {
		List<User> users =userService.getAllUsers();
		
		Link link = Link.fromUri(baseUrl).rel("self").build();		
		ResourceCollection<User> resource = new ResourceCollection<>(users);
		return  Response.ok(resource).links(link).build();
		
	}

	@Override
	public Response getUser(long id) {
		 User u=userService.getUser(id);
		 
		Link link = Link.fromUri(baseUrl).rel("self").build();		
		//ResourceCollection<User> resource = new ResourceCollection<>(u);
		return  Response.ok(u).links(link).build();
	}
	
}
