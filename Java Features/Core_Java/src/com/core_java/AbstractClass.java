package com.core_java;
/**
 * Abstract method mean we can only declare a method not defining the method
 * Abstract methods only define in abstract class
 * And we can not create the Object of abstract class, but we can make reference of abstract class
 * abstract class have both methods, abstract and non-abstract(Concrete method) method
 * 
 * 
 * --> In Java, an abstract class is a class that contains one or more abstract methods, 
 * which are methods without an implementation. Abstract classes are intended to be extended by other 
 * classes, which provide the implementation for the abstract methods.
 * 
 * --> The main reason why we cannot create an object of an abstract class in Java is that it doesn't 
 * make sense to create an object of a class that has no implementation for one or more of its methods. 
 * Since an abstract class is incomplete, it cannot be instantiated, meaning we cannot create objects 
 * of that class.
 * 
 * --> To summarize, an abstract class is designed to be a blueprint for other classes to 
 * extend and implement, and not to be instantiated directly. Therefore, 
 * Java does not allow us to create an object of an abstract class.
 *  
 *  --> we can create constructor in abstract class
 *  -->> Initialization of variables : 
 */
abstract class Car {
	
	int a ,b; // To initialized instance variable we use constructor in abstract class
	
	
	public Car() {
	}
	
	public Car(int a, int b ) { // Constructor in abstract class
		this.a = a;
		this.b= b;
	}
	
	
	abstract int sum(int a, int b);
	
	abstract public void drive(); // with the help of abstract keyword we can make a abstract method
	
	public void music() {
		System.out.println("Playing Music");
	}
	
	abstract void music(String str);
	abstract void music(int a);
}

class Neno extends Car{
	
	int sum=0;
	
	
	public Neno() {
	}
	
	public Neno(int a, int b) {
		super(a, b);
		
	}

	public void drive() {
		System.out.println("Nano Drive ");
	}

	@Override
	int sum(int a, int b) {
		return sum=a+b;
	}

	@Override
	void music(String str) {

		System.out.println("String music method called");
	}

	@Override
	void music(int a) {
		 System.out.println("int music method called");
		
	};
}

public class AbstractClass {

	public static void main(String[] args) {

//		Car car = new Car() ;// can no create object of abstract class
		Car car = new Neno();
		Car car2 = new Neno(8, 8);
		car.drive();
		car.music(); // we can also called non-abstract class
		int a = car2.a;
		int b = car2.b;
		System.out.println("a = " + a +" "+ "b = "+ b);
		
		int sum = car2.sum(4, 6);
		System.out.println(sum);
		
		car.music("sumit");
		car.music(2);
			
		
	}

}
