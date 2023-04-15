package com6_.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
	String name;
	Subject subject;
	int num;
	public Student(String name, Subject subject, int num) {
		super();
		this.name = name;
		this.subject = subject;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + subject + ", num=" + num + "]";
	}
	
	
}

enum Subject{
	Science, Math, Physics
}

public class Example {

	public static void main(String[] args) {

		List<Student> listStu = Arrays.asList(
				new Student("sumit", Subject.Science, 55),
				new Student("sourabh", Subject.Math, 58),
				new Student("sourabh", Subject.Science, 58),
				new Student("sumit", Subject.Math, 55),
				new Student("Rohit", Subject.Physics, 60),
				new Student("sumit", Subject.Physics, 55)
				);
//		System.out.println(listStu);
		
		Map<String , List<Subject>> map = new HashMap<>();
		listStu.stream().forEach(stu -> {
			map.computeIfAbsent(stu.getName(), st -> new ArrayList<Subject>()).add(stu.getSubject());});
		System.out.println(map);
		
		//Using FlatMap Convert Individual String into Combine String
		List<String> lst1 = Arrays.asList("A", "B");
		List<String> lst2 = Arrays.asList("C", "D", "E");
		List<String> lst3 = Arrays.asList("F");
		System.out.println(
		Stream.of(lst1, lst2, lst3).flatMap(List :: stream).collect(Collectors.toList())
		);
		
//		Using FlatMap Convert Individula number into Combine List
		Map<String, List<Integer>> map2 = new HashMap<>();
		map2.put("One", Arrays.asList(1,2,3));
		map2.put("Two", Arrays.asList(4,5,6));
		System.out.println(
		map2.values().stream().flatMap(List :: stream).collect(Collectors.toList()));
		
		
		List<Map<String, Integer>> list = new ArrayList<>();
		Map<String, Integer> map3 = new HashMap<>();
		map3.put("One", 11);
		map3.put("Two", 22);
		
		Map<String, Integer> map4 = new HashMap<>();
		map4.put("Three", 33);
		map4.put("Four", 44);
		
		list.add(map3);
		list.add(map4);
		
		System.out.println(list);
		System.out.println(
		list.stream().map(Map :: values).flatMap(Collection :: stream).collect(Collectors.toList())
				);
	}

}
