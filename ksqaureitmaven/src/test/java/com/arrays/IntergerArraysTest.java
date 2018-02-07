package com.arrays;

import java.util.Arrays;

import junit.framework.TestCase;

public class IntergerArraysTest extends TestCase{

	public void testRemove(){
		int a[]={2,4,8,6,5};
		int b[]={2,4,6,5};
	
		int rm[]=IntegerArrays.remove(a, 8);
		assertEquals(Arrays.toString(b), Arrays.toString(rm));
	}
	
	public void testInsert(){
		int a[]={2,4,8,6,5};
		int b[]={2,4,10,8,6,5};
	
		int[] iArray=IntegerArrays.insert(a,10,2);
		assertEquals(Arrays.toString(b), Arrays.toString(iArray));
		
	}
}
