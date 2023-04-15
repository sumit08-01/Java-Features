package com.core_java;

public class WrapperClasses {

	public static void main(String[] args) {

		int a = 19; // primitive data type
		Integer i = 19;// Object type //package--> class java.lang.Integer
		
//		System.out.println("P : "+a+ ", " + "obj : "+ i.getClass());
		
		Integer i1 = new Integer(a);
//		System.out.println(i1+ " " + i1.getClass()); // It's object type and it's called autoBoxing
		Integer i2 = a; 
//		System.out.println(i2.getClass()); // we can also do like this
		
		
		int a1 = i1.intValue();// Like this AutoUnBoxing
		System.out.println(a1); // it has no any method of getClass because it's primitive type and it's called 
						//AutoUnboxing
		
		int a2 = i1;
		System.out.println(a2);
		
		
		String str = "5";
		System.out.println(str.getClass().getName());
		
//		Now convert string into int
		int a3 = Integer.parseInt(str);
		System.out.println(a3); //This is primitive type not Integer class type
	}

}
