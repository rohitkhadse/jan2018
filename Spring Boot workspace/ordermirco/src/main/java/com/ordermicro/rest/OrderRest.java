package com.ordermicro.rest;

import java.util.Date;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.web.client.RestTemplate;

import com.ordermirco.domain.Customer;
import com.ordermirco.domain.Order;

@Named
@Path("/")
public class OrderRest {

	private static long id = 1;
	@Inject
	private RestTemplate restemplate;
	
	@GET
	@Path("order")
	@Produces(MediaType.APPLICATION_JSON)
	public Order submitOrder(@QueryParam("idCustomer") long customerID,
			@QueryParam("amount") long amount){
		Order order = new Order();
		System.out.println("Got Request");
		
		Customer customer = restemplate.getForObject("http://localhost:8080/customer?id={id}", 
				Customer.class, 
				customerID);
		order.setCustomer(customer);
		order.setId(id);
		order.setAmount(amount);
		order.setDate(new Date());
		
		id++;
		return order;
		
	}
}
