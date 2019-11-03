package com.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormat {
	public static void main(String[] args) {
		String date[] ={"12th Oct 2012","10th Mar 2017","1st Feb 2018"};
		
		String formatdate[]=format(date);
		for(String s : formatdate){
			System.out.println(s);
		}
	}

	private static String[] format(String[] a) {

		String result[] = new String[a.length];

		String date[] = null;
		//String date1[] = new String[3];
		String month="";
		int i=0;
		
		Map<String,String> map =new HashMap<String,String>();
		map.put("Jan", "01");
		map.put("Feb", "02");
		map.put("Mar", "03");
		map.put("Apr", "04");
		map.put("May", "05");
		map.put("Jun", "06");
		map.put("Jul", "07");
		map.put("Aug", "08");
		map.put("Sep", "09");
		map.put("Oct", "10");
		map.put("Nov", "11");
		map.put("Dec", "12");
		
		Pattern p = Pattern.compile("\\d+"); 
		
		for(String s: a)
		{
			date = s.split(" ");
			
			 
			Matcher m = p.matcher(date[0]);
			if(m.find()){
				date[0]=m.group();
			}
			
			if(Integer.parseInt(date[0])<10)
				date[0] = "0"+date[0];
			
			if(map.containsKey(date[1])){
				month=map.get(date[1]);
			}
	        
			
			result[i] = date[2] +"-"+ month +"-"+ date[0];
			
			i++;
		}
		return result;
	}
}
