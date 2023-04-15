package com.core_java.thread;

class Counter {

	int count;
//	public  void Increment() {
		public  synchronized void Increment() { // One thread at a time
		count++;
	}
}

public class RaceCondition {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		
		Runnable a = new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<1000; i++) {
					c.Increment();
				}
			}
		};
		
		
		Runnable b = new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<1000; i++) {
					c.Increment();
				}
			}
		};
		
		Thread threada = new Thread(a);
		Thread threadb = new Thread(b);
		
		threada.start();
		threadb.start();
		
		threada.join(); // Both thread the join here
		threadb.join(); 
		
		System.out.println(c.count); // here count value should be 2000 but, eveytime i go less than 2000 here we are loose data
										// How to stop this, make methods 
										// synchorinized --> It's will we one thread permission at a time
	}

}
