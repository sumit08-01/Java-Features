package com.core_java;


class Student{
	String name;
	int marks;
}

public class Array {

	public static void main(String[] args) {

//		int arr1[] = {1,2,3,4};
//		for(int i : arr1) {
//			System.out.print(i+ " ");
//		}
		
		// 1-D Array
//		int[] arr = new int[4];
//		for(int i=0; i<4; i++) {
//			System.out.println(arr[i]); // By Default Value in the array is Zero
//		}

		
//		int[] arr2 = new int[4];
//		for(int i=0; i<4; i++) {
//			arr2[i] =(int)(Math.random()*10);
//		}
//		for(int i=0; i< arr2.length; i++) {
//			System.out.println("one Dimensional Array");
//			System.out.print(arr2[i]+ " ");
//		}
		
		//2-D Array
//		int[][] arr3 = new int[3][2];
//		for(int i=0; i<arr3.length; i++) {
//			for(int j=0; j<2; j++) {
//				arr3[i][j] =(int)(Math.random()*10);
//			}
//		}
//		System.out.println("Two Dimensional Array");
//		for(int i=0; i< arr3.length; i++) {
//			for(int j=0; j<2; j++) {
//				System.out.print(arr3[i][j]+ " ");
//			}
//			System.out.println();
//		}
		
		
		//Jagged Array
//		int arrj[][] = new int[3][];
//		arrj[0] = new int[3];
//		arrj[1] = new int[4];
//		arrj[2] = new int[5];
//		System.out.println("Jagged Dimensional Array");
//		for(int i=0; i< arrj.length; i++) {
//			for(int j=0; j<arrj[i].length ; j++) {
//				arrj[i][j] =(int)(Math.random()*10);
//			}
//		}
//		for(int i[] : arrj) {
//			for(int value : i) {
//				System.out.print(value);
//			}
//			System.out.println();
//		}
		Student s1 = new Student();
		s1.name = "sumit";
		s1.marks = 87;
		
		Student s2 = new Student();
		s2.name = "sourabh";
		s2.marks = 90;
		
		Student s3 = new Student();
		s3.name = "yogi";
		s3.marks = 80;
		
		Student[] students = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		for(Student su : students) {
//			System.out.println(su.name + " : "+ su.marks);
		}
		
		
		
	}

}
