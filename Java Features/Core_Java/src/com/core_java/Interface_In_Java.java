package com.core_java;

/**
 * 
 * @author sumit
 * 
 * -->In interface by default all methods are public abstract,
 * 	ex-> public abstract void show();
 * 
 * --> In Java, an interface is a collection of abstract methods and constants that can be implemented by a class.
 *  An interface is similar to a class, but it cannot be instantiated directly. 
 *  Instead, a class must implement the interface and provide an implementation for all of its methods.
 * 
 * --> Class inherite the interface with the help of implements keyword. 
 * 	And one class can implement one or more interface, and Also one interface can extends one or more interface 
 * 
 * --> If you implements any interface in a class, then that class has compulsory to override that methods and define there body
 * 
 * --> In interface all instance variable are final and static by default
 * 
 * --> Interface have don't memory in heap, it's implemented class memory in haep
 * 
 * 
 * 
 */
interface Binterface{
	void showN();
}

interface CInt{
	void watch();
}
interface D{
	void play();
}

interface Ainterface extends CInt, D{
	
	static final int a = 4;
	String name = "sumit"; 
	
	
	
//	public abstract void show(); -->> By default public abstract
	void show();
	void music();
}

class In implements Ainterface, Binterface{

	@Override
	public void show() {
		System.out.println("Implemented show method");
	}

	@Override
	public void music() {
		System.out.println("Implemented music method");
	}
	
	public void dance() {
		System.out.println("Not overriden interface method");
	}

	@Override
	public void showN() {
		System.out.println("another Interface method");
	}

	@Override
	public void watch() {
		System.out.println("Watch movie");
	}

	@Override
	public void play() {
		System.out.println("Playing game");
		
	}
}
public class Interface_In_Java {

	public static void main(String[] args) {
		Ainterface in= new In(); // we can create reference of an interface not object
		in.show();
		in.music();
		System.out.println(in.a + " : interface instance variable");
		System.out.println(in.name + " : interface instance variable");
		
		Binterface binterface=new In();
		binterface.showN();
		
		CInt c = new In();
		c.watch();
		
		In in2 = new In();
		in2.show();
		in2.showN();
		in2.dance();
		in2.music();
		in2.play();
		in2.watch();
		
		In inw = new In();
		inw.dance();
	}

}
