package com.core_java;

class Employee{
	String name;
	int age;
	static String gender;
	
	/**
	 * initializer block -->> This block is use to initialized to instance member of class and static variable.
	 */
	{
		name = "sumit";
		age = 21;
		gender = "Male";
		System.out.println("Initializer Block");
	}
	static {
//		name= "KaliRose"; //This line giving error because in static block we can't initialized non static variable
				/**
				 * the reason behind is if we initialized a non static variable a time of class loading 
				 * after that we can't re initialized again because, at time of class loading
				 * only static variable load and the value in static variable is distributed to all
				 * and we are initialized non-static variable at run time not class loading time
				 */
		gender = "Female";
		System.out.println("Static block");
	}
	//Static Method
	public static void show() {
		System.out.println("Inside static Method");
	}
}

public class StaticKeyWord {

	public static void main(String[] args) {
		Employee employee = new Employee();
//		System.out.println("Main");
//		System.out.println(employee.name);
//		System.out.println(employee.age);
//		System.out.println(employee.gender); // This line is giving -> The static field Employee.gender should be accessed in a static way
//											/*	This is not good practice to call static variable with Class Object reference
//											 * 	But internally jiss class ke Reference bnega uss class ka he static variable call ho skta hai
//											 * 
//											*/
//		
//		System.out.println(Employee.gender);
// Output --> Static block
/**
 * static block  -->> here gender value -->> Female
 * Initializer Block -->> all value set and also gender value is overwrite with the value male
 * Main -->> Creation on object
 * sumit
 * 21
 * Male
 * Male
 */
		
		
		//Static Method 
		Employee.show();
		
		
		
		
		
	}
}


