package com.accessmodifier;

import java.util.Scanner;

//Basic Concept
public class BasicConcept {
	public static void main(String args[]){
		
		boolean flag=true;
		
		do{
			Scanner sc= new Scanner(System.in);
			
			String s = sc.nextLine();
			
			switch(s){
			case "one":
				System.out.println(1);
				break;
			case "two":
				System.out.println(2);
				break;
			case "three":
				System.out.println(3);
				break;
			default:
				flag=false;
				
		  }
		}while(flag);
		
		Student s1=new Student("Rohit","1",3.7);
		s1.display();
		Student.university="CSU";
		s1.display();
		
	}
}
