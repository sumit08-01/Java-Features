package com.core_java;

class CIntf {
	
	public void C() {
		System.out.println("Object is created");
	}
	public void show() {
		System.out.println("show method called");
	}
}

public class AnnoyamsObject {

	public static void main(String[] args) {
//		C c = new C(); // here we are creating the object and address of the object is store in c
		
			//And c reference is creating stack memory 
		// if we don't want to creating stack memory then
		new CIntf();// -->> This is called annoyomus object and we can't reuse it, if i want to call another method then we have to create a new object
							//that's why we are store the object address in reference
		new CIntf().show(); 
		
		
	}

}
