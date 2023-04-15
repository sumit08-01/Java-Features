package com.UseOfsuperKeywordwithParanthesis;

class Myclass {
	String name;
	int a ;
	public Myclass(int a, String name) {
		this.a=a;
		this.name=name;
	}
}
class Movie extends Myclass{
	String lastName;
	public Movie(int a, String name, String lastName) {
		super(a, name);// calling superclass constructor if we don't writes this then it will give error
		this.lastName=lastName;
	}
	
}

public class CopyConstructor {
	public static void main(String[] args) {
		Movie movie = new Movie(8, "sumit", "Gond");
		System.out.println(movie.name + " "+ movie.lastName+ " "+ movie.a);
	}
}
