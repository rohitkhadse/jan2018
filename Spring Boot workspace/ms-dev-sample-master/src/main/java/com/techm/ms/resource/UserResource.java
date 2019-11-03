package com.techm.ms.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import com.techm.ms.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * This is the Interface definition for User Resource
 * 
 */
@Api("users")
@Path("/users")
public interface UserResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON )
	@Consumes({MediaType.APPLICATION_JSON})
	public Response getAllUsers();
	
	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiResponses(
			value={
					@ApiResponse(code = 201, message = "SUCCESS"),
					@ApiResponse(code = 409, message = "Unable to create. "
							+ "A Acoount with name already exist")
			}
			)
	public void createUser(User user);
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON )
	public Response getUser(@QueryParam("id") long id);
	
}