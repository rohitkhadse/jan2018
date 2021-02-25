package com;

import java.time.LocalDateTime;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now().minusDays(3);

        System.out.println(localDateTime);
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