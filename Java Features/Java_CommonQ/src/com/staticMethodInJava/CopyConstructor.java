package com.staticMethodInJava;

class Myclass {
	public static void printName() {
		System.out.println("My Name is sumit");
	}
	public void returnStatement() {
		System.out.println("retrun Statement");
		return; // we can write retrun statement in like this, only if we have return type of the method is void
	}
}
public class CopyConstructor {
	public static void main(String[] args) {
		Myclass.printName();
	}
}
