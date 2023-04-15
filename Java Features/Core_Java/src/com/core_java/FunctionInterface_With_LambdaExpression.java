package com.core_java;

/**
 * 
 * @author sumit
 *
 *--> Functional interface have only one abstract method
 */

@FunctionalInterface
interface FunctionalIn{
//	void show();
//	void show(int i, double j);
//	void show(int i);
	
	//return
	int sum (int i, int j);
//	void play();// if i uncommit this line it's giving me error saying it's not a functional interface
}

public class FunctionInterface_With_LambdaExpression {

	public static void main(String[] args) {

//		FunctionalIn fn = () -> 
//			System.out.println("show");
//		fn.show();t
//		FunctionalIn fn = (i,j) -> 
//		System.out.println("show "+ i+ " : "+j);
//		fn.show(4,5.5);
//		FunctionalIn fn =i ->System.out.println("show "+ i);
//		fn.show(4);
		
		FunctionalIn fn = (i,j) -> (i+j);
		System.out.println(fn.sum(4, 6));
		
		
	}
}
