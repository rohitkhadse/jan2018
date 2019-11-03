package com.domino.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/*
 * You have use @ComponentScan because your main class is in not in base package com.domino
 * it is in separate package com.domino.rest
 * */
@SpringBootApplication
@ComponentScan(basePackages={"com.domino.*"})
public class BookSpringBootApp {

	public static void main(String[] args) {
		SpringApplication.run(BookSpringBootApp.class, args);  
	}
}
