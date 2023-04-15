package com.core_java;

class Boy{
	public String name;
	public int age;
	
	
	private String name1;
	private int age1;
	
	public String getName() {
		return name1;
	}
	public int getAge() {
		return age1;
	}
	public void setter(int age1 ) {
		this.age1 = age1;
	}
	public void setter(String name1 ) {
		this.name1 = name1;
	}
}

public class Encapulation_OOPS {

	public static void main(String[] args) {

		Boy boy = new Boy();
		boy.name = "sumit";
		boy.age = 21;
//		System.out.println(boy.name1); // Error saying --> he field Boy.name1 is not visible because they are private
		System.out.println(boy.name + " : " + boy.age+ " Non private Member"); // Here my Instance variable are public, 
														//	so any one can stole my data to secure them 
														//	we have OOPs Concept known as Encapulation
		/**
		 * Encapsulation --> Data Hiding is known as encapsulation 
		 * Mean other classes can not use my instance variable without getter Method.
		 */
		boy.setter(25);
		boy.setter("sourabh");
		System.out.println(boy.getName()+ " : "+ boy.getAge() + " private Member ");
		
	}

}
