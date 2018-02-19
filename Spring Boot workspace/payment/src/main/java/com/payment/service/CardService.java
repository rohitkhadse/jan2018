package com.payment.service;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.payment.dao.CardDao;
import com.payment.dao.CardDaoImpl;
import com.payment.entity.Cards;

@Path("/cardservice")
public class CardService {
	
	private final static String SUCCESS = "<response>SUCCESS</response>";
	private final static String FAILURE = "<response>FAILURE</response>";

	private CardDao cardDAO = new CardDaoImpl();

	@GET
	@Path("/validate/{cardnum}/{pin}")  //don't pass actual card info to get method,this has security flaw 
	//@Produces("application/xml")
	@Produces(MediaType.APPLICATION_XML)
	public Cards validatecard(@PathParam("cardnum") int cardnum,
			@PathParam("pin")String pin){
		if((cardDAO.validate(cardnum, pin))!= null){
			return cardDAO.validate(cardnum, pin);
		}
		else{
			return cardDAO.validate(cardnum, pin);
		}
			
	}
	
	
	@PUT
	@Path("/pay/{cardnum}/{pin}/{fund}")
	@Produces(MediaType.APPLICATION_JSON)
	public String pay(@PathParam("cardnum")int cardnum,@PathParam("pin")String pin,@PathParam("fund")int fund){
		return cardDAO.pay(cardnum,pin, fund);
	}
	
}
