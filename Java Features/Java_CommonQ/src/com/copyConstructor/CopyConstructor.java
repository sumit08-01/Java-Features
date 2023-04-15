package com.copyConstructor;

class Myclass {
	String name;
	String myName;

	public Myclass(String name) {
		this.name=name;
		
	}
	
	public Myclass(Myclass obj) {
		this.myName=obj.name;
	}

}

public class CopyConstructor {

	public static void main(String[] args) {
		Myclass myclass = new Myclass("Sumit");
		Myclass myclass2 = new Myclass(myclass);
		System.out.println(myclass.name);
		System.out.println(myclass2.myName);
		System.out.println(myclass==myclass2);
		System.out.println(myclass.name==myclass2.myName);
	}

}
