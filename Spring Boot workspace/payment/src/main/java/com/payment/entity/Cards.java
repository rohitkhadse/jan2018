package com.payment.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="cards")
@XmlRootElement
public class Cards {
	
	@Id
	private int cardnum;
	private String pin;
	private int fund;
	
	public int getCardnum() {
		return cardnum;
	}
	public void setCardnum(int cardnum) {
		this.cardnum = cardnum;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public int getFund() {
		return fund;
	}
	public void setFund(int fund) {
		this.fund = fund;
	}

}
