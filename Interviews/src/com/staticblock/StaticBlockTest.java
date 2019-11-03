package com.staticblock;

public class StaticBlockTest {
	public static int i;
	
	static{
		i = 0;
		System.out.println("static block excuted");
	}

	public static void main(String[] args) {
		//StaticBlockTest staticBlockTest =  new StaticBlockTest();
		System.out.println(StaticBlockTest.i);
	}

}
