package com1_.private_in_interface;

interface Sayable{  
    default void say() {  
        saySomething(); // Calling private method  
        sayPolitely(); //  Calling private static method  
    }  
    // Private method inside interface  
    private void saySomething() {  //Before java 9 it show compile time error
        System.out.println("Hello... I'm private method");  
    }  
    // Private static method inside interface  
    private static void sayPolitely() {  
        System.out.println("I'm private static method");  
    }  
}  
public class PrivateMethodInInterface implements Sayable {  
    public static void main(String[] args) {  
        Sayable s = new PrivateMethodInInterface();  
        s.say();  
    }  
}  