package com.core_java.exceptionhandling;

public class Exceptionhandling {

	public static void main(String[] args) {

		int i =2;
		int j=0;
		int[] arr = new int[5];
		String str= null;
		
		try {
			j = 18/i;
			System.out.println(str.length());
			System.out.println(arr[2]);
			System.out.println(arr[5]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Arrray" + e);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Exception occured" + e);
		}
		catch (Exception e) {
			System.out.println("Something went worng" + e);
		}
		System.out.println(j);
		System.out.println("bye");
	}

}
