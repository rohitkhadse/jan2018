package com.rohitkhadse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LandT {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("a", 1));
		employeeList.add(new Employee("b", 2));
		employeeList.add(new Employee("c", 1));
		employeeList.add(new Employee("d", 3));
		employeeList.add(new Employee("e", 1));
		employeeList.add(new Employee("f", 2));
		
		
		List<Integer> ageList = new ArrayList<>();
		Map<Integer,List<String>> mapNew = new HashMap<>();
		Map<Integer,List<String>> mapNew2 = new HashMap<>();
		
		for(Employee e:employeeList)
		{
			if(!ageList.contains(e.getAge())){
				ageList.add(e.getAge());
			}
		}
		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();
		List<String> three = new ArrayList<>();
		
		for(Employee e:employeeList){
			if(e.getAge() == 1){
				one.add(e.getName());
			}
			else if(e.getAge() == 2){
				two.add(e.getName());
			}
			else if(e.getAge() == 3){
				three.add(e.getName());
			}
		}
		
		mapNew.put(1, one);
		mapNew.put(2, two);
		mapNew.put(3, three);
		
		mapNew.forEach((k,v)->System.out.println("Age : " + k + " Name : " + v));

	}

}
