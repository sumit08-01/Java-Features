package com.return_In_Constructor;

class Number {
	
	int a ;
	
	public Number(int a ) {
		
		if(a<0) {
			System.out.println("Number is negative");
			return; // If we comment this return statement then both print statement is run 
		}
		System.out.println("Number is positive");
	}
}

public class RetrrnInConstructor {

	public static void main(String[] args) {

		Number number = new Number(9);
		
	}

}
