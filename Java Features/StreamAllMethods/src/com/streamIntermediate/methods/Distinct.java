package com.streamIntermediate.methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Distinct {

	public static void main(String[] args) {

		/*
		 * The distinct method in Java Streams is an intermediate operation that returns
		 * a stream consisting of the distinct elements of the original stream. It is
		 * used to remove duplicates from a stream.
		 */
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5);
		Stream<Integer> distinctNumbers = numbers.stream().distinct();
		distinctNumbers.forEach(System.out::println);
		

	}
	/*
	 * Note that the distinct method uses the equals method of the elements to
	 * determine if they are distinct. If you have a custom object and you want to
	 * remove duplicates based on some specific criterion, you can override the
	 * equals and hashCode methods in your object to achieve this.
	 */

}
