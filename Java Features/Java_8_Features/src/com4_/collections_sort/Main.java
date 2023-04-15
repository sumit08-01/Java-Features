package com4_.collections_sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Employee> empList = Arrays.asList(
				new Employee("101", "sumit"),
				new Employee("102", "Rohit"),
				new Employee("104", "manish"),
				new Employee("105", "Vishal")
				);
		
		System.out.println(empList);
		
		//1-> Method By AnonymousClass
//		Comparator<Employee> comp = new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee emp1, Employee emp2) {
//				return emp1.getName().compareTo(emp2.getName());
//			}
//		};
		
		//2-> Method by using lambda
//		Collections.sort(empList,( emp1, emp2) -> emp1.getName().compareTo(emp2.getName()));
		
		//3-> Method by using Method Reference (::)
//		Syntax -->> ClassName::MethodName
		Collections.sort(empList,Comparator.comparing(Employee :: getName));
		
		
		System.out.println(empList);
	}

	
	
}
