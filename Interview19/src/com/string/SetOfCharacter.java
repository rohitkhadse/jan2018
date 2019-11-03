package com.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetOfCharacter {

	public static void main(String[] args) {
		String s= "roohiit";
		
		System.out.println(removeDuplicate(s));
		System.out.println("Using Set \n"+removeDuplicateUsingSet(s));
	
	}

	private static String removeDuplicateUsingSet(String s) {
		StringBuilder sb= new StringBuilder();
		Set<Character> linkedHashSet = new LinkedHashSet<>();
		
		for(int i = 0;i<s.length();i++){
			if (linkedHashSet.contains(s.charAt(i)))
			  linkedHashSet.remove(s.charAt(i));
			else{
				linkedHashSet.add(s.charAt(i));
			}
		}
		
		for(Character c : linkedHashSet){
			sb.append(c);
		}
		return sb.toString();
	}

	private static String removeDuplicate(String s) {
		StringBuilder stringBuilder = new StringBuilder();
		s.chars().distinct().forEach(c -> stringBuilder.append((char)c));
		return stringBuilder.toString();
	}

}
