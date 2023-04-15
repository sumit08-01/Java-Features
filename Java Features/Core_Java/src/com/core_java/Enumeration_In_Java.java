package com.core_java;

/**
 * 
 * @author sumit
 * 
 * Enum is a class in java because in java everything is object
 *
 *-->> You can't extend Enum 
 *
 */

enum Su {
	sumit,gond,monu, running,panding, failed
}

public class Enumeration_In_Java {

	public static void main(String[] args) {
		
		Su s = Su.gond;
		System.out.println(s.getClass().getSuperclass());
		System.out.println(s);
		System.out.println(s.ordinal());// give index of the constant, it's generally start with zero
		System.out.println(Su.monu.ordinal());
		
		Su[] sus = Su.values();
		for(Su i : sus) {
			System.out.println(i + " : " + i.ordinal());
		}
		
		Su su = Su.failed;
		
		if(su == Su.running)
			System.out.println("running");
		else if(su == Su.panding)
			System.out.println("panding");
		else if(su == Su.failed)
			System.out.println("failed");
		else
			System.out.println("All done");
	}

}
