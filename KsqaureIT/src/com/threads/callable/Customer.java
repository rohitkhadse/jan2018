package com.threads.callable;

public class Customer {
	private int accNO;
	private int balance;
	private String name;
	public  boolean flag=false;
	
	public Customer(){
		
	}
	public Customer(int accNO, int balance, String name) {
		super();
		this.accNO = accNO;
		this.balance = balance;
		this.name = name;
		
	}
	public int getAccNO() {
		return accNO;
	}
	public void setAccNO(int accNO) {
		this.accNO = accNO;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getCusName() {
		return name;
	}
	public void setCusName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [accNO=" + accNO + ", balance=" + balance + ", name=" + name + "]";
	}
	
}