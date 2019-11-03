package com.micro.rest;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.micro.entity.Customer;

@Named
@Path("/")
public class CustometRest {
	private static List<Customer> customers = new ArrayList<Customer>();
	
	static{
		Customer c1 = new Customer();
		c1.setId(1);
		c1.setName("Customer 1");
		c1.setEmail("customer1@gmail.com");
		
		Customer c2 = new Customer();
		c2.setId(2);
		c2.setName("Customer 2");
		c2.setEmail("cusomter2@gmail.com");
		
		Customer c3 = new Customer();
		c3.setId(3);
		c3.setName("Customer 3");
		c3.setEmail("cusomter3@gmail.com");
		
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getCustomers(){
		return customers;
	}
	
	@GET
	@Path("customer")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomer(@QueryParam("id") long id){
		Customer c=null;
		
		for(Customer cus:customers){
			if(cus.getId() == id)
				c=cus;
		}
		if(c==null){
			System.out.println("C is null");
		}
		return c;
	}
	
	

}
