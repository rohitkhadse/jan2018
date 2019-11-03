package com.someCodingChallenges.stack;

public class StackImplementation {

	public static void main(String[] args) {
		Stack stack = new Stack(3);
		//stack.pop(); //throw exception : stack is empty
		//stack.peek();  //throw exception : stack is empty
		stack.push(1);
		stack.push(2);
		stack.push(3);
		//stack.push(4); throw exception : stack is full
		
		System.out.println("peek of the stack :" + stack.peek());
		
		System.out.println(stack.toString());

	}

}
