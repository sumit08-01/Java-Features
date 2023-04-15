package com.streamTerminalOpertaion.methods;

import java.util.List;

public class AnyMatch {

	public static void main(String[] args) {

		/*
		 * The anyMatch method in Java Streams is a terminal operation that returns a
		 * boolean value indicating whether any element in the stream matches the given
		 * predicate. The method returns true if at least one element in the stream
		 * satisfies the condition; otherwise, it returns false.
		 */
		
		List<Integer> numbers = List.of(2, 4, 6, 7, 10);
		boolean hasOdd = numbers.stream().anyMatch(n -> n % 2 != 0);
		System.out.println(hasOdd);
		
		
		/*
		 * Note that the anyMatch method can be used on any stream, including infinite
		 * streams. If the stream is infinite and there is at least one element that
		 * matches the predicate, the anyMatch method will return true and stop
		 * processing the remaining elements in the stream.
		 */
		
		List<String> names = List.of("John", "Jane", "Adtm", "Eve");
		boolean hasA = names.stream().anyMatch(name -> name.contains("a"));
		System.out.println(hasA);
		
		
		


	}

}
