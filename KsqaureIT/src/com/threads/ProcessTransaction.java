package com.threads;

//Class for unsynchronized threading
public class ProcessTransaction extends Thread{
	Customer c ;
	int amountToDeduct;
	
	
	public void setCustomer(Customer c,int balance){
		
		this.c = c;
		this.amountToDeduct= balance;
	}
	
	
	public  void processPayment(Customer c,int balance) throws Exception {
		if(c.getAccNO()==2){
			throw new Exception("Transaction Failed");	
			//System.exit(0);
		}
		else{
			c.setBalance(c.getBalance()-balance);
			System.out.println(c);
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 
	}
	
	public void run(){
		
			try {
				processPayment(this.c,amountToDeduct);
				
			} catch (Exception e) {
				Customer.flag=true;
				e.printStackTrace();
			} 
		
		
	}  
	

}
