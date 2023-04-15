package com1_.lambdaFunction;

abstract class Person {
	abstract void eat();
}

interface Eatable{
	void eat();
}

class student{
	void eat() {
		System.out.println("Student eat");
	}
}


public class AnonymousClass {

	public static void main(String[] args) {

		student student = new student();
		student.eat();
		
		
		
		student student2 = new student() {
			void eat() {
				System.out.println("main class eat");
			}
		};
		student2.eat();
		
		
		
		Person person = new Person() {
			
			@Override
			void eat() {
				System.out.println("Person class eat method");
			}
		};
		person.eat();
		
		
		Eatable eatable = new Eatable() {
			
			@Override
			public void eat() {
				System.out.println("Interface Eatable method called");
			}
		};
		eatable.eat();
	}
	

}

