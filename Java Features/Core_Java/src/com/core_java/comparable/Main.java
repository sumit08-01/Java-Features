package com.core_java.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student that) {
		if(this.age> that.age)
			return 1;
		else 
			return -1;
	}
}

public class Main {

	public static void main(String[] args) {
		
		Comparator<Student> comparator = ( o1, o2) -> o1.age> o2.age? 1 : -1;
			
		List<Student> list = new ArrayList<>();
		list.add(new Student("sumit", 22));
		list.add(new Student("sabbal", 21));
		list.add(new Student("sourabh", 24));
		list.add(new Student("deepak", 20));
		
		Collections.sort(list,comparator);// I don't want to use comparator 
//		Collections.sort(list);// I use to use compareTo 
		System.out.println(list);
	}

}
