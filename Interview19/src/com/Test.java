package com;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Employee> hashSet = new HashSet();
        hashSet.add(new Employee(1,"Rohit"));
        hashSet.add(new Employee(1,"Rohit"));

        hashSet.forEach(System.out::println);
    }
}

class Employee{
    int id;
    String name;

    Employee(int id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}