package com.streamTerminalOpertaion.methods;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collector {

	public static void main(String[] args) {
		
		/*
		 * In Java Streams, the collect method is a terminal operation that collects the
		 * elements of a stream into a container such as a List, Set, or Map. The
		 * collect method takes a Collector object that specifies how the elements
		 * should be collected.
		 * 
		 * There are two overloaded versions of the collect method in Java Streams:
		 * 
		 * collect(Collector<? super T,A,R> collector): This version takes a Collector
		 * object that describes how to accumulate the elements of the stream into a
		 * result container.
		 * 
		 * collect(Supplier<R> supplier, BiConsumer<R,? super T> accumulator,
		 * BiConsumer<R,R> combiner): This version takes three arguments: a supplier
		 * function that creates a new result container, an accumulator function that
		 * adds an element to the result container, and a combiner function that merges
		 * two result containers into one.
		 */

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> result = numbers.stream().collect(Collectors.toList());
		System.out.println(result);
		
		
		/*
		 * In this example, we first create a stream of strings stream containing some
		 * elements. We then use the collect method that takes three arguments to create
		 * a new HashSet container, add each element of the stream to the set using the
		 * HashSet::add method reference as the accumulator, and merge the sets obtained
		 * from parallel streams using the HashSet::addAll method reference as the
		 * combiner. The collect method returns a Set containing the distinct elements
		 * of the stream.
		 */
		
		Stream<String> stream = Stream.of("apple", "banana", "orange", "banana");
		Set<String> set = stream.collect(HashSet::new, HashSet::add, HashSet::addAll);
		System.out.println(set);
		


	}

}
