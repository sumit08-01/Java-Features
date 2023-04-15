package com1_.RecordsClassPreview;

public class RecordClassPreview {

	record Person(String name, String email, String phoneNumber) {

//		int number = 30; -->> This is not allowed in record classes, non-static is not allowed
		static int num = 30; //-->> This is allowed, static is allowed
//		Person(String name, String email, String phoneNumber) {
//			if(name == null) 
//				throw new IllegalArgumentException("name is null");
//				this.name = name;
//				this.email = email;
//				this.phoneNumber = phoneNumber;
//		}
		// compact constructor
		Person {
			if (name == null)
				throw new IllegalArgumentException("name is null");
		}
		
		public String name(){ // You can give your name as well
			System.out.println("Kuch log likho");
			return name;
		}
	}

	public static void main(String[] args) {

		Person person = new Person("sumit", "Sumitgond9999@gmail.com", "7503372336");
		System.out.println(person);
		System.out.println(person.name());
		Person person2 = new Person("sumit", "Sumitgond9999@gmail.com", "7503372336");
		Person person3 = new Person("sumitgond", "Sumitgond9999@gmail.com", "7503372336");

		System.out.println(person.equals(person2));
		System.out.println(person.equals(person3));

//		Person person4 = new Person(null, "Sumitgond9999@gmail.com", "7503372336");
//		System.out.println(person4);

	}

}
