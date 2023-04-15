package com.core_java;

class Up{
	public void show() {
		System.out.println("Up show");
	}
}
class Down extends Up{
	public void show1() {
		System.out.println("Down show");
	}
}


public class UpCasting_DownCasting {

	public static void main(String[] args) {

		Up up = new Down(); // it's automactic
		up.show(); // Up casting : (object of Down and reference of Up)
		
		
		Down down = (Down) up;
		down.show1(); // it's down casting
		
		
	}

}
