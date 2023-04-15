package com.mainMethod;

public class BeforeJava7 {
	
	static int a = 10;
	static int b = 20;
	
	static{
		a =60;
		b=90;
	}
	
//	public static void main(int args) {
//		System.out.println(args);
//
//	}
//
//	public static void main(Boolean args) {
//		System.out.println(args);
//	}
//
	public static void main(String[] args) {
		System.out.println("a"+ a);
		System.out.println("b"+ b);
//		System.out.println("Hello");
////		main(true);
////		main(1);
//		staticMethod();
//		BeforeJava7 beforeJava7 = new BeforeJava7();
//		beforeJava7.instanceMethod();
//	}
//	
//	public static int staticVar = 10;
//    public int instanceVar = 20;
//
//    public static void staticMethod() {
//        // Do something with staticVar
////        int result = BeforeJava7.staticVar * 2;
//        int result = BeforeJava7.staticVar * 2;
//        System.out.println(result);
//    }
//
//    public void instanceMethod() {
//        // Do something with instanceVar
//        int result = this.instanceVar + 5;
//        System.out.println(result);
//        // Cannot access staticVar using 'this'
//        // int result = this.staticVar * 2; // This will result in a compilation error
		
		
    }
    
}
