package com3_.method_reference;


////Ex-->>>1
//
//interface Company{
//	
//	void show();
//}
//
//class Employee{
//	
//	public static void Name() {
//		System.out.println("Static method of Employee class ");
//	}
//	
//}
//
//public class StaticMethodReference {
//
//	public static void main(String[] args) {
//
//		Company name = Employee::Name; // For receving variable type is must be interface ex->Company name
//		name.show(); // calling with that variable method of functional interface
//		
//	}
//
//}


////Ex--->>2 we are using predefined functional interface Runnable to refer static method.
//public class StaticMethodReference {  
//	
//    public static void ThreadStatus(){  
//        System.out.println("Thread is running...");  
//    }  
//    public static void main(String[] args) {  
//        Thread t2=new Thread(StaticMethodReference::ThreadStatus);  
//        t2.start();       
//    }  
//}  


//Ex-->>3 
import java.util.function.BiFunction;  
class Arithmetic{  
public static int add(int a, int b){  
return a+b;  
}  
public static float add(int a, float b){  
return a+b;  
}  
public static float add(float a, float b){  
return a+b;  
}  

public static float multiply(int a, int b){  
	return a+b;  
}  
}  
public class StaticMethodReference {  
public static void main(String[] args) {  
	
	//BiFunction<Argument1, Argument2, ReturnType> variable =  ContainingClass::staticMethodName
	
BiFunction<Integer, Integer, Integer>adder1 = Arithmetic::add;  
BiFunction<Integer, Float, Float>adder2 = Arithmetic::add;  
BiFunction<Float, Float, Float>adder3 = Arithmetic::add;  
BiFunction<Integer, Integer, Float>adder4 = Arithmetic::multiply;  
int result1 = adder1.apply(10, 20);  
float result2 = adder2.apply(10, 20.0f);  
float result3 = adder3.apply(10.0f, 20.0f);  
float result4 = adder4.apply(20, 20);  
System.out.println(result1);  
System.out.println(result2);  
System.out.println(result3);  
System.out.println(result4);  

}  
}  

