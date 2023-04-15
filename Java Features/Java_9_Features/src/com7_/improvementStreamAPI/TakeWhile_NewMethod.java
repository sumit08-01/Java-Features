package com7_.improvementStreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TakeWhile_NewMethod {

	 public static void main(String[] args) {  
	        List<Integer> list   
//	        = Stream.of(1,2,1,4,5,6,7,8,9,10) // output []  
	        = Stream.of(2,2,4,4,5,6,7,8,9,10)  // output [2,2,4,4] In this example, we are getting first two elements because these are even and stops at third element. 
	                .takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());     
	    System.out.println(list);  
	    }  
}
