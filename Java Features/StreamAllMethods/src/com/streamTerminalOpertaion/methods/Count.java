package com.streamTerminalOpertaion.methods;

import java.util.Arrays;
import java.util.List;

public class Count {

	public static void main(String[] args) {

		/*
		 * The count method in Java Streams is a terminal operation that returns the
		 * number of elements in the stream as a long value. It is used to count the
		 * number of elements in a stream that satisfy a certain condition.
		 */
		
		List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "sa");
		long count = strings.stream().filter(s -> s.contains("a")).count();
		System.out.println(count); // number of words contain word "a" is 5
		
		

	}

}
