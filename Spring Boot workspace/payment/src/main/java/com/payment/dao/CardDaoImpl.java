package com.payment.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.config.HibernateUtility;
import com.payment.entity.Cards;

public class CardDaoImpl implements CardDao{

	public Cards validate(int cardnum, String pin) {
		
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();

		Criteria cr = session.createCriteria(Cards.class);
		cr.add(Restrictions.eq("cardnum", cardnum));
		cr.add(Restrictions.eq("pin", pin));

		@SuppressWarnings("unchecked")
		List<Cards> cardlist = cr.list();
		session.getTransaction().commit();
		if (cardlist.isEmpty()) {
			return null;
		} else {
			return cardlist.get(0);
		}		
		
	}

	@Override
	public String pay(int cardnum,String pin, int fund) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		
		CardDaoImpl cardDao = new CardDaoImpl();
		Cards c = cardDao.validate(cardnum, pin);
		if(c!=null){
			//Cards c = cardDao.validate(cardnum, pin);
			c.setFund(c.getFund()-fund);
			int availableFund = c.getFund();	
			
			Query q = session.createQuery("update Cards set fund=:fund where cardnum=:cardnum");
			q.setParameter("fund",availableFund);
			q.setParameter("cardnum", cardnum);
			
			int updateResult = q.executeUpdate();
			
			System.out.println(updateResult);
			session.getTransaction().commit();
			return "Row affected "+updateResult;
		}
		else{
			return "Transaction fail";
		}
		
	}

}
