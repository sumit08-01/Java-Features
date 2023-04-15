package com6_.stream;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		list.stream().parallel().forEach(System.out :: print);
		System.out.println();
		list.parallelStream().forEach(System.out :: print);
	}
}

/*
 * One of the prominent features of Java 8 (or higher) is Java Parallel Stream.
 * It is meant for utilizing the various cores of the processor. Usually, any
 * Java code that has only one processing stream, where it is sequentially
 * executed. However, by using parallel streams, one can separate the Java code
 * into more than one stream, which is executed in parallel on their separate
 * cores, and the end result is the combination of the individual results. The
 * order in which they are executed is not in our control. Hence, it is
 * suggested to use a parallel stream when the order of execution of individual
 * items does not affect the final result.
 */