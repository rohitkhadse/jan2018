package com.car.search;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestCar {

	public static void main(String[] args) {
		Car c1= new Car("green",2017,"sedan",2000);
		Car c2= new Car("red",2017,"suv",33000);
		Car c3= new Car("green",2016,"truck",40000);
		Car c4= new Car("black",2015,"sedan",23000);
		
		Car[] array = {c1,c2,c3,c4};
		
		List<Car> list = new ArrayList<Car>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		
		//searchEntity(array,2017);
		//searchMulEntity(array,"green",2017);
		
		
		
//		for(int i=0;i<array.length;i++){
//			if(i==array.length){
//				break;
//			}
//			else{
//				if(array[i].compareTo(array[i+1]) == 1)
//					System.out.println(array[i]);
//				else if(array[i].compareTo(array[i+1]) == -1)
//					System.out.println(array[i+1]);
//				else if(array[i].compareTo(array[i+1]) == 0){
//					System.out.println(array[i]);
//					
//				}
//					
//					
//			}
//			
//		}
		
		//Arrays.sort(array);
		
		Collections.sort(list);
		
		for(Car c:list){
			System.out.println(c);
		}
		System.out.println("===========================");
		
		Collections.sort(list, new YearComparator());
		for(Car c:list){
			System.out.println(c);
		}
		
		

	}

	//Search with one arguments
	private static void searchEntity(Car[] array, Object obj) {
		for(int i=0;i<array.length;i++){
			if(array[i].getColor()==obj){
				System.out.println(array[i]);
			}
			else if(array[i].getType()==obj){
				System.out.println(array[i]);
			}
			else if(obj.equals(array[i].getYear())){
				System.out.println(array[i]);
			}
			
		}
		
	}
	
	//Search with multiple arguments
	private static void searchMulEntity(Car[] array, Object... objs) {
		
		for(Object obj:objs){
			
			for(int i=0;i<array.length;i++){
				if(array[i].getColor()==obj){
					System.out.println(array[i]);
				}
				else if(array[i].getType()==obj){
					System.out.println(array[i]);
				}
				else if(obj.equals(array[i].getYear())){
					System.out.println(array[i]);
				}
				
			}
		}
		
		
	}

}