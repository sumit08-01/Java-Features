package com.core_java;


//final class A2{ // If we make are class final then we can't inherit that class 
	class A2{
	
//	final public void show() { // If we make are method final then anyone can't override my method 
		public void show() { 
			System.out.println("A2 show");
	}
}
class B2 extends A2{
	
	public void show() {
		System.out.println("A2 show");
	}
}

public class Final_Keyword {

	public static void main(String[] args) {

		final int a = 9;
//		a = 5;// This line is giving an error 
				//(The final local variable a cannot be assigned. It must be blank and not using a compound assignment)
		System.out.println(a);
		
		
		
		
		
	}

}
