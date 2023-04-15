package com.core_java.exceptionhandling;

class Myexception extends Exception{
	public Myexception(String str) {
		super(str);
	}
}

public class Throw_keyword {

	public static void main(String[] args) {

		int i =20;
		int j=0;
		
		try {
			j = 18/i;
			if(j==0)
//				throw new ArithmeticException("Zero is here");
			throw new Myexception("Zero is here");
				
		}
		catch (ArithmeticException e) {
//			e.printStackTrace();
//			j=18/1;
			System.out.println("Exception occured " + e.getMessage());
		}
		catch (Myexception e) {
//			e.printStackTrace();
//			j=18/1;
			System.out.println("My own Exception : " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Something went worng" + e);
		}
		System.out.println(j);
		System.out.println("bye");
	}

}
