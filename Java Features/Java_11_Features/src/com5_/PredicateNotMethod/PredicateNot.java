package com5_.PredicateNotMethod;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNot {

	public static boolean isEven(Integer number) {
		return number%2 == 0;
	}
	
	public static void main(String[] args) {

		List<Integer> numbers = List.of(1,4,3,9,7,8,6);
		
		//This is for Predicate Method of negate() 
		Predicate<Integer> evenNumberPredicate = number -> number%2 == 0;
//		numbers.stream().filter(evenNumberPredicate).forEach(System.out :: println);
//		numbers.stream().filter(evenNumberPredicate.negate()).forEach(System.out :: println);

		//This is also for Predicate Method not
		
//		numbers.stream().filter(PredicateNot :: isEven).forEach(System.out :: println);
		numbers.stream().filter(Predicate.not(PredicateNot :: isEven) ).forEach(System.out :: println);
		
	}
	
	
	
	
}
