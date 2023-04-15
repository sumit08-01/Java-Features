package com.core_java;

public class StringInternMethod {

	public static void main(String[] args) {

//		String s1 = new String("sumit");
//		String s2 = new String("sumit");
//		System.out.println(s1==s2); // false
		/**
		 * false (because,as we know if we creating object with the help of new-keyword with the same value 
		 * JVM created object with different reference but the value is same, and both the object occupied the memory
		 * To Solve the problem developer creating a new method called intern();
		 * 
		 */
		
//		String s1 = new String("sumit").intern();
//		String s2 = new String("sumit").intern();
//		System.out.println(s1==s2);
		
//		String s1 = new String("sumit");
//		String s2 = new String("sumit");
//		String s3 = "sumit";
////		System.out.println(s3==s1.intern());
		
		 String s1 = "sumit";  //SCP
	        String s2 = s1.intern();  //SCP
	        String s3 = new String("sumit");  //Heap
	        String s4 = s3.intern();     //Heap 
	        System.out.println(s1==s2); // True  
	        System.out.println(s1==s3); // False  
	        System.out.println(s1==s4); // True       
	        System.out.println(s2==s3); // False  
	        System.out.println(s2==s4); // True        
	        System.out.println(s3==s4); // False  
	        
	        
	        
	}								

}
