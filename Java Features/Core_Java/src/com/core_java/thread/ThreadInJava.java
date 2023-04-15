package com.core_java.thread;

/**
 * 
 * @author sumit
 * 
 * 
 * In Thread we have a method run in which we perform actions
 * and to start the method we have call run with the start() --> method predefine method
 * And to make our class threadable we have to extends thread class
 *
 */

class A extends Thread{
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("Hii");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class B  extends Thread{
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("Hello");
		}
	}
}

public class ThreadInJava {

	public static void main(String[] args) throws InterruptedException {

		A a = new A();
		B b = new B();
		a.start();
	Thread.sleep(5);
		b.start();
	}

}
