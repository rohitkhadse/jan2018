package com.rohitkhadse;

public class RollingDice {

	public static void main(String[] args) {
		System.out.println("Dice value: "+rollDice());
	}
	
	public static int rollDice(){
		return  (int)(Math.random()*6)+1;
	}

}
