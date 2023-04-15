package com.constructorOverloading;

class myClass{
	int a ;
	String name;
	
	public myClass() {
		System.out.println("Non Parameterized");
	}
	
	public myClass(int a , String name) {
		this.a=a;
		this.name=name;
		System.out.println("Constructor with values name  "+ name +" and Value "+ a);
	}
	public myClass(int a ) {
		this.a=a;
		System.out.println("Constructor with Value "+ a);
	}
	public myClass(String name) {
		this.name=name;
		System.out.println("Constructor with  name  "+ name );
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		myClass myClass = new myClass();
		myClass myClass2 = new myClass(2, "sumit");
		myClass myClass3 = new myClass(2);
		myClass myClass4 = new myClass("sumit");
		
	}
}
