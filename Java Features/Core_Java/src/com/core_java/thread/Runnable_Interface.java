package com.core_java.thread;

import org.w3c.dom.DOMImplementation;

/**
 * 
 *
 * @author sumit
 * 
 * Runnable is interface 
 * 
 * As we know we can't extends multiple classes in java but implemets multiple interface in java
 * That's why we are implements Runnable interface of Thread Class
 * 
 * Runnable is a functional interface
 *
 */
//class AT implements Runnable{
//	public void run() {
//		for(int i=0; i<5; i++) {
//			System.out.println("Hii");
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
//class BT  implements Runnable{
//	public void run() {
//		for(int i=0; i<5; i++) {
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println("Hello");
//		}
//	}
//}

public class Runnable_Interface {

	public static void main(String[] args) {

//		Runnable a=new AT();
//		Runnable b = new BT(); // As we know we can create the reference the object,but this reference not have start method because 
//								// start run method, because run method is in Thread Class , 
//								//that why we create object of Thread and class and pass our runnable interface
//								//and pass in the constructor of Thread object
//		
//		Thread threada = new Thread(a);
//		Thread threadb = new Thread(b);
//		
//		threada.start();
//		threadb.start();
		
		//Using lambda expression
		
		Runnable a = new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					System.out.println("Hiiiiii");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		
		Runnable b = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					System.out.println("Hellooooooooooo");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		};
		
		Thread threada = new Thread(a);
		Thread threadb = new Thread(b);
		threada.start();
		threadb.start();
		
	}

}

