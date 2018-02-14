package com.factoryspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.factoryspring.entity.BreadImpl;

public class SpringContextTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springbeans.xml");
		BreadImpl bread = (BreadImpl) ctx.getBean("saraleeWheat");
	
		System.out.println(bread.getIngredients());
		System.out.println(bread.getCalories());
		System.out.println(bread.getManufacturer());

	}

}
