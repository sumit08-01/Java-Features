package com7_.improvementStreamAPI;

import java.util.stream.Stream;

public class OfNullable {

	public static void main(String[] args) {  
        Stream<Integer> val   
        = Stream.ofNullable(null);     
    val.forEach(System.out::println);  
    
    }  
}
