package com.core_java;

class Emp{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name, Emp obj) {
		obj.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class This_Keyword {

	public static void main(String[] args) {
		
		Emp emp = new Emp();
		emp.setName("sumit", emp); // here we creating emp object two time java say hey not creating the object again and again
									// That's why this keyword come into a picture
									// this -->> Is refer to the current object
		emp.setAge(21);
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());

	}

}
