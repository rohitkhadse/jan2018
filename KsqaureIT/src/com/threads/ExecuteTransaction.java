package com.threads;

public class ExecuteTransaction extends Thread{
	Customer c ;
	int amountToDeduct;
	
	public void setCustomer(Customer c,int balance){
		this.c = c;
		this.amountToDeduct= balance;
	}

	public synchronized static void processPayment(Customer c,int balance) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 c.setBalance(c.getBalance()-balance);
		// System.out.println(c);
	}
	
	public void run(){  
		processPayment(this.c,amountToDeduct); 
	}  
	

}
