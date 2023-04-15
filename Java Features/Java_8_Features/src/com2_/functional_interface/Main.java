package com2_.functional_interface;

@FunctionalInterface
interface People{
	public void show();
//	public void print(); // If i un-comment this line then it give the error saying it's a functional interface and annoted with @FunctionalInterface
	
	static void show1() {
		System.out.println("show1 static method called from interface ");
	}
	
	default void show2() {
		System.out.println("show2 default method called from interface ");
	}
}

class DefaultAndStatic implements People{

	@Override
	public void show() {

		System.out.println("DefaultAndStatic class \"show\" method called");
	}
	
}
public class Main {

	public static void main(String[] args) {
		
		People people = ()-> {
			System.out.println("show method called from interface with lambda expression");
		};
		people.show();
		
		DefaultAndStatic andStatic = new DefaultAndStatic();
		andStatic.show();// calling overriden method of functional interface
		People.show1(); // calling static method with the help of name of Interface.methodName
		andStatic.show2();// calling default method of interface with the help of who's class implements functional interface 
		
		
	}

}
