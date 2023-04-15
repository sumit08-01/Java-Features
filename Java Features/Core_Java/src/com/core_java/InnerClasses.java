package com.core_java;

class AB{
	public void show() {
		System.out.println("Show of class AB");
	}
	class B{
		public void showB() {
			System.out.println("Show of Inner class of AB is B");
		}
	}
	
	static class C{
		public void showC() {
			System.out.println("Show of Inner class of AB is C");
		}
	}
}

public class InnerClasses {

	public static void main(String[] args) {

		AB ab = new AB();
		ab.show();
		
		AB.B obj= ab.new B();
		obj.showB();
		
//		C objC= new C();
//		objC.show();
//		Show of class AB
//		Show of Inner class of AB is B
//		Object is created
//		show method called
		
		AB.C objc= new AB.C();
		objc.showC();
		
	}

}
