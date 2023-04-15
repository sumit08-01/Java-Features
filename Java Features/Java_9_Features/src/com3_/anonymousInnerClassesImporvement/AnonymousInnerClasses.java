package com3_.anonymousInnerClassesImporvement;

abstract class ABCD<T>{   //abstract anonymous class
    abstract T show(T a, T b);  
}   

public class AnonymousInnerClasses {

	 public static void main(String[] args) {  
	        ABCD<String> a = new ABCD<>() { // diamond operator is empty, compiler infer type  
//	        ABCD<String> a = new ABCD<String>() {
	            String show(String a, String b) {  
	                return a+b;   
	            }  
	        };    
	        String result = a.show("sumit"," Gond");  
	        System.out.println(result);  
	    }  
}
