package com1_.lambdaFunction;

interface Operations{
	
	int result(int a, int b);
}

public class LambdaAsArgument {
	
	public static int sum(int a, int b, Operations obj) {
		return (obj.result(a, b));
	}

	public static void main(String[] args) {
		
		System.out.println(sum(4, 5, (a,b) -> (a+b)));
		System.out.println(sum(5, 4, (a,b) -> (a-b)));
		System.out.println(sum(4, 5, (a,b) -> (a*b)));
		

	}

}
