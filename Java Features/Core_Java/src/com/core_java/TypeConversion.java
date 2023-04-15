package com.core_java;

public class TypeConversion {

	public static void main(String[] args) {

		byte bpostive = 127; // byte Range -128 to 127
		byte bnegative = -128;
		//short Range -32768 to 32767
		short sne = -32768;
		short spo = 32767;
		//int range -2,147,483,648 to 2,147,483,647
		int in = -2147483648; //In java integer value will be int by default
		int ip = 2147483647;
		//long range -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
		long lp = 9223372036854775807l;
		long ln = -9223372036854775808l;
		//float Range 1.4 x 10^-45 to 3.4 x 10^38.
		float f = 3.45f;
		//double Range 4.9 x 10^-324 to 1.8 x 10^308.
		double d = 3.45; //In java point value will be double by default
		
		//Type conversion
		
		byte b = (byte) 32767; // It's called explicit type casting Big Data Type to Small Data Type 
		short s = 127; // Implicit type casting it's automatic type casting Small data type to Big dataYpe
		int t = (int) 985678905553l;
		float ft = 3.54f;
//		int x = ft; // cannot convert from float to int that's why explicit coversion done 
		int x = (int) ft; // But this point you loose data e,g .54, x can only be store 3 because int can't store point value
		System.out.println(x);//3
		float fint = 456; // it will give value in point e,g 456.0 
		System.out.println(fint); // 456.0
		int xd = (int) 4.6785442; // same as double
		System.out.println(xd); // 4 
		
		int ib = 257;  //When we try to convert an int value that is outside this range to a byte, the value will be truncated to fit into 8 bits
		byte bin = (byte) ib;  // 257 % 257 = 1
		System.out.println(bin); // 99
		
		//Type promotion 
//		Type promotion, also known as type coercion, is the automatic conversion of a value from one data type to another data type by the Java compiler or virtual machine. Type promotion typically occurs when two values of different data types are used together in an expression or assignment statement, and one of the values needs to be converted to match the data type of the other value.
//		Java follows a set of rules for type promotion that determine which data type will be used when two different data types are involved in an expression. These rules are designed to prevent data loss and to ensure that the result of the operation is as precise as possible.
		byte n = 10;
		byte a = 30;
		
		int x2 = n*a; // Here we perform on byte but the result we got is int compiler automatic convert into int it's called type promotion 
		System.out.println(x2);
		
		
		// '5' = 53(ASCII/Unicode value) , 
		System.out.println(5+'5'); // 58
		System.out.println('5'+'5'); // 106
		System.out.println(5-'5');// -48
		System.out.println(5*'5');// 265
		System.out.println('5'*'5');// 2809
		System.out.println(5/'5');// 0
		System.out.println('5'/'5');// 1
		System.out.println(5+"5"); // 55
//		System.out.println(5-"5");// give error
		/*
		 * In Java, when we subtract a character value from another character value, the
		 * ASCII/Unicode value of the character is used in the subtraction operation.
		 * The character '5' has an ASCII/Unicode value of 53, while the character '5'
		 * also has an ASCII/Unicode value of 53. Therefore, the expression 5-'5' is
		 * equivalent to 5-53, which results in a value of -48. However, the output of
		 * System.out.println(-48); will be -48 and not 0. This is because
		 * System.out.println() prints the integer value of its argument, and in this
		 * case, the integer value is -48.
		 */
		
	}

}
