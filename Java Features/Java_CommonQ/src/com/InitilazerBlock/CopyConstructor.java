package com.InitilazerBlock;

class Myclass {
	String name;
	{
		name = "sumit";
		System.out.println("Initilazier Block in called");
//		To make our logic/functionalities to common for all objects, mean while of object creation then we should use non-static block.
	}

	public Myclass() {
		System.out.println("Constructor is called");
	}
}

public class CopyConstructor {
	public static void main(String[] args) {
		Myclass myclass = new Myclass();
		System.out.println(myclass.name);
	}
}
