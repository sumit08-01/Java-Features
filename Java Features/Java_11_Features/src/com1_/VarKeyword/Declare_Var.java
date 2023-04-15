package com1_.VarKeyword;

import java.util.ArrayList;

@FunctionalInterface
interface myInt {
    
    int add(int a, int b);
}

public class Declare_Var {

	
//	var s = 50;  // var can to be used as global variable 
	public static void main(String[] args) {

		// int
        var x = 100; //it can be used as local variable
  
        // double
        var y = 1.90;
  
        // char
        var z = 'a';
  
        // string
        var p = "Sumit";
  
        // boolean
        var q = false;
  
        // type inference is used in var keyword in which it
        // automatically detects the datatype of a variable
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        System.out.println(p);
//        System.out.println(q);
//        System.out.println(s);
        
        
//var cannot be used as a Generic type.
        // Generic list using var
        var<var> al = new ArrayList<>();
          // add elements
        al.add(10);
        al.add(20);
        al.add(30);
        al.add("sumit");
        
        // print the list
//        System.out.println(al);
        
    	
//var cannot be used with the generic type.
       var<Integer> al1 = new ArrayList<Integer>();
       
         // add elements 
       al1.add(10);
       al1.add(20);
       al1.add(30);
//       all.add("String");
       
       // print the list
       System.out.println(al1);
       
         // This is valid since type is decided
         // based on ArrayList<String>
         var list = new ArrayList<String>();

         
// declaration without
         // initialization
//         var variable;
           
// This is also not valid
//         var variable = null;
        
        
//         var obj = (a, b) -> (a + b);
//         
//         // calling add method
//       System.out.println(obj.add(2, 3));
        
	}
}
