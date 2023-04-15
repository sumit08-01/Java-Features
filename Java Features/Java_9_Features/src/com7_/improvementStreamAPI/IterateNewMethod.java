package com7_.improvementStreamAPI;

import java.util.stream.Stream;

public class IterateNewMethod {

	 public static void main(String[] args) {  
	        Stream.iterate(1, i -> i <= 10, i -> i+1)  
	        .forEach(System.out::println);  
	    }  
}
