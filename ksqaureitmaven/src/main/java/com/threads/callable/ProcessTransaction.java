package com.threads.callable;

import java.util.concurrent.Callable;

//Class for unsynchronized threading
public class ProcessTransaction implements Callable<Customer>{
	Customer c ;
	int amountToDeduct;
	
	public void setCustomer(Customer c,int balance){
		
		this.c = c;
		this.amountToDeduct= balance;
	}
	
	
	public  void processPayment(Customer c,int balance) throws Exception {
		
		if(c.getAccNO()==2){
			c.flag=true;
			throw new Exception("Transaction Failed");	
			
		}
		else{
			c.setBalance(c.getBalance()-balance);
			
		}
		/*try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		 
	}
	

	@Override
	public Customer call()  {
		try {
			processPayment(this.c,amountToDeduct);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return this.c;
	}  
	

}
