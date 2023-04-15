package com.core_java.thread;

public class SendNull {

	Object object = null;
	
	public static void main(String[] args) {
		test(null);
	}
	
	private static void test(Object o) { // The method test(Object) from the type SendNull is never used locally
		System.out.println("Object method");
	}
	
	private static void test(String s) {
		System.out.println("String method");
	}
	
	

}

/*
 * why String Method called
 * When the test method is called with null as the argument, the compiler looks
 * for the method with the most specific parameter type that can handle a null
 * value. In this case, String is a more specific type than Object, since String
 * is a subclass of Object, and null can be implicitly converted to any
 * reference type.
 */
