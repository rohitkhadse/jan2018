package com.datastructure;

abstract class Animal {
    abstract void sayHello();
}

class Test{
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            void sayHello() {

            }
        };
        animal.sayHello();
    }
}
