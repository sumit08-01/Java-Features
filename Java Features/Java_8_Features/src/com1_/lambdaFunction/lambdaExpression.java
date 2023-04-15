package com1_.lambdaFunction;

interface people{
	public void show();
	//if we made more than one method in a interface then we can't achieve the lambda expression
	// To achieve the lambda expression the interface must be "functional interface"
//	one abstract method is called functional interface
//	public void print();
}

public class lambdaExpression {

	public static void main(String[] args) {

		people lambda = ()-> {
			System.out.println("Main method called");
		};
		lambda.show();
//		Java lambda expression is treated as a function, so compiler does not create .class file.
		
	}

}
