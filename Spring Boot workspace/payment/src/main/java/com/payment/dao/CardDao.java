package com.payment.dao;

import com.payment.entity.Cards;

public interface CardDao {
	public Cards validate(int cardnum,String pin);
	public String pay(int cardnum,String pin,int fund);

}
