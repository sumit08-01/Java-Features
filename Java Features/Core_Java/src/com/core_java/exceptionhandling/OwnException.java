package com.core_java.exceptionhandling;

/**
 * 
 * @author sumit
 * 
 * --> If you want to create you own exception then, create a class and extends excpetion class
 *
 *-->> if you are send a message with your exception, first receive in your exception 
 *		class with the help of constructor, and message reveice a message as a stringS
 *
 *		After the send it to parent class with the help of super keyword
 */

class SumitExceptions extends Exception{ 
	public SumitExceptions(String str) {
//		System.out.println(str);
		super(str);
	}
}

public class OwnException {

	public static void main(String[] args) {

		int i =0;
		int j=0;
		
		try {
			j = 18/i;
				throw new SumitExceptions(" exception :::");
		} catch (SumitExceptions e) {
			System.out.println("My own : " + e);
		}
//		catch (Exception e) {
//			System.out.println("Exception cathc : "+ e);
//		}
		System.out.println(j);
		System.out.println("Bye");
	}

}
