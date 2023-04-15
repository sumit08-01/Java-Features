package com6_.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainStream {

	public static void main(String[] args) {

//		Using Range --->>>
//		IntStream.range(3, 9).forEach(x-> System.out.println(x));
//		IntStream.range(5, 9).forEach(System.out :: print);
//		System.out.println();
//		
		
//		Using Iterator
//		IntStream intStream = IntStream.iterate(2, x-> x-1);
//		intStream.limit(5).forEach(x-> System.out.println(x));
		
//		long count = Stream.of(1,2,3,4,5,6,7,8).filter(x -> x>=5).count();
//				System.out.println(count);
//		
////		Using Map
//		Stream.of("java", "javascript", "Go", "Python").filter(x -> x.contains("j")).map(String :: toUpperCase).forEach(System.out::println);
//		
////		Using Random
//		Stream.generate(Math :: random).limit(6).forEach(System.out::println);
		
	}

}
