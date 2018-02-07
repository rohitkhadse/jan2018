package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRegexPattern {

	public static void main(String[] args) {
		String s="Today's date 18-01-2018",s2="my email is rohit91@mail.com";
		
		
		//String pattern="[0-9]{2}[\\W/|\\W-]|[0-9]{2}[\\W/|\\W-]|[0-9]{2,4}";
		
		String datePattern="\\d+[\\W/|\\W-]|\\d+[\\W/|\\W-]|\\d+{2,4}";
		
		String emailPattern = "\\w+@[a-z]*.[a-z]*";
		
		Pattern p=Pattern.compile(datePattern);
		
		Matcher m = p.matcher(s); 
		
		Pattern p1=Pattern.compile(emailPattern);
		
		Matcher m2 = p1.matcher(s2); 
		
		while(m.find()){
			System.out.print(m.group());
		}
		
		System.out.println();
		
		while(m2.find()){
			System.out.print(m2.group());
		}

	}

}
