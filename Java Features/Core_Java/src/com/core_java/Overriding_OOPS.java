package com.core_java;

class CalN{
	public int add(int a, int b) {
		return a+b; // this is useLess Now
	}
}
// Overriding above add method of parent class
class AdvanceCal extends CalN{
	public int add(int a, int b) {
		return a+b+1;
	}
}
// Overloading mean -->> Run at COmpile time
// Overriding mean -->> Run and pr check
public class Overriding_OOPS {

	public static void main(String[] args) {

		AdvanceCal advanceCal=new AdvanceCal();
		System.out.println(advanceCal.add(4, 6));
	}

}