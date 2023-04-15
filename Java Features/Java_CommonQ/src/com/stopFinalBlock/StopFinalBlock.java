package com.stopFinalBlock;

public class StopFinalBlock {

	public static void main(String[] args) {

		try {
			if(2%0==10) System.out.println("try block");
		}
		catch (Exception e) {
			System.out.println("catch block");
			e.printStackTrace();
			System.exit(0);  //To stop of finally block execution and other code
		}
		finally {
			System.out.println("Finally block run");
		}
	}

}
