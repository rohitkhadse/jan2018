package com.designpattern;

public class SingletonDesignPatternTest {
	
	private static SingletonDesignPatternTest  sdp = new SingletonDesignPatternTest();
	
	private SingletonDesignPatternTest(){}
	
	public static SingletonDesignPatternTest getInstance(){
		return sdp;
	}
	
	public void showMessage(){
		System.out.println("Hello World");
	}
}
