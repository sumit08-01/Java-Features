package com2_.tryWithResource;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Try_With_Resources {
	// java 9 & > 9
	public static void main(String[] args) throws FileNotFoundException {  
        FileOutputStream fileStream=new FileOutputStream("javatpoint.txt");  
        try(fileStream){  // In java 7 & 8 this line give compile time error ( saying --> Variable resource not allowed here for source level below 9)
             String greeting = "Welcome to javaTpoint.";      
                byte b[] = greeting.getBytes();       
                fileStream.write(b);      
                System.out.println("File written");           
        }catch(Exception e) {  
            System.out.println(e);  
        }   
//	But the above program would not work with Java 7 because we can't put resource declared outside the try-with-resource.
    }  
	
//	java 7 & 8
//	 public static void main(String[] args) throws FileNotFoundException {  
//	        try(FileOutputStream fileStream=new FileOutputStream("javatpoint.txt");){  
//	             String greeting = "Welcome to javaTpoint.";      
//	                byte b[] = greeting.getBytes();       
//	                fileStream.write(b);      
//	                System.out.println("File written");           
//	        }catch(Exception e) {  
//	            System.out.println(e);  
//	        }         
//	    }  
////	 This code executes fine with Java 7 and even with Java 9 because Java maintains it's legacy.

}