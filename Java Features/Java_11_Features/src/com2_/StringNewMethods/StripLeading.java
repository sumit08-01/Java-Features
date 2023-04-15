package com2_.StringNewMethods;

public class StripLeading {

	public static void main(String[] args) {

		String str = " sumit Gond ";
		String str1 = " sumit sGond ";
//		System.out.println(str.strip().replace('s', 'G'));
//		System.out.println(str.strip().replace("um", "di"));
//		System.out.println(str1.strip().replaceFirst("s", "d"));
//		System.out.println(str.strip().replaceAll(" ", "@"));
		
		
		System.out.println(str.stripLeading().replaceAll(" ", "@"));

		
		
	}

}
