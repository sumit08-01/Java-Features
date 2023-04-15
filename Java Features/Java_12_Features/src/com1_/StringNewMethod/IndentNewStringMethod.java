package com1_.StringNewMethod;

public class IndentNewStringMethod {

	public static void main(String[] args) {

		String str = "sumit\ngond";
		System.out.print(str.indent(-2).replaceAll(" ", "@"));
		System.out.print(str.indent(4).replaceAll(" ", "@"));
	}

}
//It takes integer n as input and does indentation accordingly. 
//
//Also, each line is suffixed with “\n” (a newline character).