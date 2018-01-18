package com.accessmodifier.subclass;

import com.accessmodifier.Variables;

public class ABC extends Variables{

	public static void main(String[] args) {
		ABC a= new ABC();
		a.m1();
		//a.m2();  //Compilation Error, m2() is private
		a.m3();
		//a.m4();	//Compilation Error, m4() is default
		
		Variables v = new Variables();
		//v.a;			//Compilation Error, a is private
		System.out.println(v.b);
		//v.d=10;		//Compilation Error, d is final
	
	}

}
