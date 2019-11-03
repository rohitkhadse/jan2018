package com.practice;

import java.util.Arrays;

class Stack{
    private int capacity;
    private int array[];
    private int top;

    public Stack(int capacity){
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1;
    }

    public void push(int number){
        if (isFull()){
            System.out.println("Stack is full");
            System.exit(1);
        }
        array[++top] = number;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            System.exit(1);
        }
        return array[--top];
    }

    private boolean isFull() {
        return this.top == capacity-1;
    }


    private boolean isEmpty() {
        return top == -1;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "capacity=" + capacity +
                ", array=" + Arrays.toString(array) +
                ", top=" + top +
                '}';
    }
}

public class StackImplementation {

    public static void main(String[] args) {
        Stack stack = new Stack(3);
//        stack.push(10);
//        stack.push(11);
//        stack.push(12);
//        stack.push(14);
        stack.pop();
        //System.out.println(stack);
    }
}
