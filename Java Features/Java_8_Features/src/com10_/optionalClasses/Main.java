package com10_.optionalClasses;

import java.util.*;

/*Java introduced a new class Optional in jdk8. 
It is a public final class and used to deal with NullPointerException in Java application. 
You must import java.util package to use this class. 
It provides methods which are used to check the presence of value for particular variable.*/
/*public static <T> Optional<T> empty() --->>>It returns an empty Optional object. No value is present for this Optional.*/

/*To avoid the abnormal termination, we use Optional class. 
In the following example, we are using Optional. So, our program can execute without crashing.*/


public class Main {

	public static void main(String[] args) {  
        String[] str = new String[10]; 
        str[5] = "SUMITgOND"; 
        Optional<String> checkNull = Optional.ofNullable(str[5]); 
        Optional<String> empty = Optional.empty();  
        if(checkNull.isPresent()){  // check for value is present or not  
            String lowercaseString = str[5].toLowerCase();  
            System.out.println(lowercaseString); 
            checkNull.ifPresent(System.out::println); //By using Mehthod Reference
            System.out.println(checkNull.get());    // printing value by using get method  
            System.out.println("orElse: "+checkNull.orElse("Value is not present"));  
            System.out.println("orElse: "+empty.orElse("Value is not present"));  
        }else  
            System.out.println("string value is not present");  
    }  

}
