package com3_.method_reference;

interface Sayable{  
    void say();  
}  
public class InstanceMethodReference {  
	
    public void saySomething(){  
        System.out.println("Hello, this is non-static method.");  
   }  
    
    public static void main(String[] args) {  
        InstanceMethodReference methodReference = new InstanceMethodReference(); // Creating object  
        
            Sayable sayable = methodReference::saySomething;  // Referring non-static method using reference  
            sayable.say();   // Calling interface method 
            
            // Referring non-static method using anonymous object  
            Sayable sayable2 = new InstanceMethodReference()::saySomething; // You can make Object like this and called using method Reference  
            sayable2.say();   // Calling interface method  
    }  
} 
