package com2_.StringNewMethods;

import java.util.stream.Collectors;

public class Lines {

	public static void main(String[] args) {

		String str = "Sumit\nGond"; //
        System.out.println(str.lines().collect(Collectors.toList()));
       
		System.out.println(str.lines());
		
//		str.lines() -->> return a stream
	}

}
