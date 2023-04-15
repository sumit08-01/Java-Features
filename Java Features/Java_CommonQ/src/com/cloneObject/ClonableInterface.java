package com.cloneObject;

public class ClonableInterface implements Cloneable {
	private int a;
	private String name;

	public ClonableInterface(int a, String name) {
		this.a = a;
		this.name = name;
	}

	@Override
	public String toString() {
		return "a=" + a + ", name=" + name + "";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		ClonableInterface obj1 = new ClonableInterface(0, "sumit");
		System.out.println(obj1.toString());
		ClonableInterface obj2 = (ClonableInterface) obj1.clone();

		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));

	}

}
