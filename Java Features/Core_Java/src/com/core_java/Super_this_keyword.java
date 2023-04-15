package com.core_java;


class A {
	
	public A() {
//		this(); // giving error --> Recursive constructor invocation A()
		System.out.println("non-parameterized A class");
	}
	public A(int a) {
		System.out.println("non-parameterized A class class int value");
	}
	
	
}

class B extends A {
	
	public B() {
		super();
		System.out.println("non-parameterized B class");
	}
	public B(int a) {
//		super(); // If we are not added this java added by default
		this();
		System.out.println("non-parameterized B class int value");
	}
}

public class Super_this_keyword{

	public static void main(String[] args) {
		B b = new B(5);
		//Now i want to call both consturctor on a class Then this() comes in picture
//		this() is called the same class constructor
		
	}

}
