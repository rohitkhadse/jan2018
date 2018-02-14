package com.aa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SprintContextTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans-sample.xml");
		BreadImpl bread = (BreadImpl)ctx.getBean("saraleeWheat");
		System.out.println(bread.getPrice());

	}

}
