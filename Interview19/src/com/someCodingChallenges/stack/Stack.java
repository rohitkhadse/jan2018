package com.someCodingChallenges.stack;

import java.util.Arrays;

public class Stack {
	private int capacity;
	private int array[];
	private int top;
	
	Stack(int capacity){
		this.array= new int[capacity];
		this.capacity = capacity;
		this.top = -1;
	}
	
	public void push(int item){
		if(isFull()){
			throw new RuntimeException("Stack is Full");
		}
		array[++top] = item;
	}
	
	public int pop(){
		if(isEmpty()){
			throw new RuntimeException("Stack is Empty");
		}
		return array[top--];
	}
	
	public int peek(){
		if(isEmpty()){
			throw new RuntimeException("Stack is Empty");
		}
		return array[top];
	}
	
	public boolean isFull(){
		return top == capacity -1;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}

	@Override
	public String toString() {
		return "Stack [capacity=" + capacity + ", array=" + Arrays.toString(array) + ", top=" + top + "]";
	}
	
}
