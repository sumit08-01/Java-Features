package com.UseOfthis;

class Myclass {
	String name;
	int a;

	public Myclass(int a) {
		this(a, "sumit");
	}

	public Myclass(int a, String name) {
		this.name = name;
		this.a = a;
	}
}

class Movie {
	public static void play() {
		System.out.println("playing Movie");
	}
}

public class CopyConstructor {
	public static void main(String[] args) {
		Myclass myclass = new Myclass(5);
		Myclass myclass2 = new Myclass(0, "");
		System.out.println(myclass.a + " " + myclass.name);
		System.out.println(myclass2.a + " " + myclass2.name);

		Movie movie = null;
		movie.play();
//		If you call a static method on an object with a null reference, you won’t get an exception and the code will run.
//		This is admittedly very misleading when reading someone else’s code, and it is best practice to always use the class name when calling a static method.
	}
}