package com.core_java;

class An{
	public void show() {
		System.out.println("In Class An");
	}
}
//class Bn extends An{
//	public void show() {
//		System.out.println("In Class Bn");
//	}
//}

public class AnonymousClass {

	public static void main(String[] args) {
//		An an = new Bn(); // every time I create object of Bn, a .class file will we generated
		
		An an= new An() {
			public void show() {
				System.out.println("show in main method");
			};
		};
		an.show();// Not calling An class show method
		
		
		
	}

}
