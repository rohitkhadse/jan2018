package com.digital;

class FoodFactory extends Food{

	public Food getFood(String myFood){
		if(myFood.equals("FastFood")){
			return new FastFood();
		}
		else{
			return new Fruit();
		}	
	}
	
	@Override
	public void serveFood() {
		
	}
}
abstract class Food{
	public abstract void serveFood();
}

class FastFood extends Food{
	public void serveFood(){
		System.out.println("I'm serving "+ getClass().getSimpleName());
	}
}

class Fruit extends Food{
	public void serveFood(){
		System.out.println("I'm serving "+ getClass().getSimpleName());
	}
}


public class Test{
	public static void main(String args[]){
		FoodFactory myFoods  = new FoodFactory();
		Food food1 = myFoods.getFood("FastFood");
		Food food2 = myFoods.getFood("Fruit");
		System.out.println("My name is: "+food1.getClass().getName());
		System.out.println("My name is: "+food2.getClass().getName());
		System.out.println("Our superclass is: "
				+food1.getClass().getSuperclass().getName());
		food1.serveFood();
		food2.serveFood();
	}
}
