package com.digital;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {

	public static void main(String[] args) {
		String email = "rohitss_1212@hackerrank.com";
		
		System.out.println(validate(email));

	}
	
	public static boolean validate(String email){
		String regex ="[a-z]{1,6}_{0,1}[0-9]{0,4}@hackerrank.com";
		//String regex ="[a-z]{1,6}_{0,1}\\d{0,4}@hackerrank.com";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		return matcher.matches();
	}
}
