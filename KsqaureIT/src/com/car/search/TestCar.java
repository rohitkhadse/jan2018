package com.car.search;

public class TestCar {

	public static void main(String[] args) {
		Car c1= new Car("green",2017,"sedan");
		Car c2= new Car("red",2017,"suv");
		Car c3= new Car("green",2016,"truck");
		Car c4= new Car("black",2015,"sedan");
		
		Car[] array = {c1,c2,c3,c4};
		
		//searchEntity(array,2017);
		searchMulEntity(array,"green",2017);
		

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
