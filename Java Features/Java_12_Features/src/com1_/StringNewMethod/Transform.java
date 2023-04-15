package com1_.StringNewMethod;

public class Transform {

	public static void main(String[] args) {

		String str = "sumit";
		System.out.println(str.transform(s -> s.substring(2)));
		System.out.println(str.transform(s -> s.substring(2,4)));
	}

}