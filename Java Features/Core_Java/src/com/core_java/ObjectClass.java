package com.core_java;

import java.util.Objects;

class Obj{
	
	int a ;
	String s;
	
	@Override
	public String toString() { // here we override the toString, we change his implementation
		return a + " : "+ s;
	}

	@Override // By source 
	public int hashCode() {
		return Objects.hash(a, s);
	}

	@Override // By source 
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Obj other = (Obj) obj;
		return a == other.a && Objects.equals(s, other.s);
	}
	
//	public boolean equals(Obj obj) {
//		if(this.s.equals(obj.s) && this.a == obj.a )
//			return true;
//		return false;
//	}
	
}

public class ObjectClass {

	public static void main(String[] args) {

		Obj obj = new Obj();
		obj.s="sumit";
		obj.a = 12;
		System.out.println(obj.toString());
		/**
		 * To String Return -->> return getClass().getName() + "@" + Integer.toHexString(hashCode());
		 * 															Obj@626b2d4a
		 * 
		 */
		
		Obj obj2 = new Obj();
		obj2.s="sumit";
		obj2.a = 12;
		boolean result = obj==obj2; // false : because it's hash code is different, we can't do anything in this but we can override the equals method 
		boolean resulte = obj.equals(obj2); // false : because it's hash code is different
		System.out.println(result);
		System.out.println(resulte);
		
		
		
	}

}
