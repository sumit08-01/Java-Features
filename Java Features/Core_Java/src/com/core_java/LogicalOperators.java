package com.core_java;

public class LogicalOperators {

	public static void main(String[] args) {

		
		//Or Operator (If any one condition is true it's return true else false
		// short circuit (if 1st condition is true it is not check for second it is simply return true)
//		if( 5 < 3 | 6 < 5) {
//			System.out.println("OR Operator");
//		}else {
//			boolean b = false;
//			System.out.println(b);
//		}
		// And Operator(If both condition is true then is it is giving true else giving false)
		// short circuit ( if 1st condition is false it is not check for second it is simply return false)
//		if( 5 > 3 & 6 < 5) {
//			System.out.println("OR Operator");
//		}else {
//			boolean b = false;
//			System.out.println(b);
//		}
		
		boolean b = 8>5|5>4|4>5;
		boolean a = 8>5&5>4&4>3;
//		System.out.println(b);
		System.out.println(a);
		
//		Not Operator
//		! it's simply convert true into false and vice-versa
//		long a = 10;
//		if(!(a == 10)) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
	}

}