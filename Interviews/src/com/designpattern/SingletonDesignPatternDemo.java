package com.designpattern;

public class SingletonDesignPatternDemo {

	public static void main(String[] args) {
		//SingletonDesignPatternTest instance =  new SingletonDesignPatternTest();
		
		SingletonDesignPatternTest instance =  SingletonDesignPatternTest.getInstance();
		
		instance.showMessage();
	}

}
