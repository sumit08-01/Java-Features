package com.streamTerminalOpertaion.methods;

import java.util.Arrays;
import java.util.List;

public class AllMatch {

	public static void main(String[] args) {
		
		/*
		 * Here are some key differences between the two methods:
		 * 
		 * Mutability: Arrays.asList() returns a mutable list, while List.of() returns
		 * an immutable list. Type of returned list: Arrays.asList() returns a list
		 * backed by an array, while List.of() returns a "regular" List object. Variadic
		 * arguments: List.of() allows between 0 and 10 arguments to be passed in, while
		 * Arrays.asList() can take any number of arguments or an array. It's worth
		 * noting that both Arrays.asList() and List.of() are not thread-safe and should
		 * not be used in concurrent applications.
		 */		
		
		/*
		 * The allMatch method in Java Streams is a terminal operation that returns a
		 * boolean value indicating whether all the elements in the stream match the
		 * given predicate. The method returns true if all the elements in the stream
		 * satisfy the condition; otherwise, it returns false.
		 */

		List<Integer> list = List.of(2,4,6,8,10);
		boolean match = list.stream().allMatch(e -> e%2==0);
		System.out.println(match); // True because all are even Numbers
		
		List<String> names = Arrays.asList("John", "Jane", "Adam", "Eve");
		boolean allLong = names.stream().allMatch(name -> name.length() > 3);
		System.out.println(allLong); //False because The word "Eve" is 3 - length
		
		
	

	}

}
