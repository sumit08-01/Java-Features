package com.ObjectOfAbstractClass;



abstract class Myclass {
	
	public abstract void print();
}
public class CopyConstructor extends Myclass{
	public static void main(String[] args) {
		CopyConstructor constructor = new CopyConstructor();
		constructor.print();// calling the abstract class implemented method by making it's subclass object
	}

	@Override
	public void print() {
		System.out.println("Abstructed class implemented method");
	}
	

}
