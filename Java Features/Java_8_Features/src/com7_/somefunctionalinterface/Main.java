package com7_.somefunctionalinterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class Main {
	
//	1-> Predicate -->> return Boolean test(t obj)
//	2-> BiPredicate -->> return boolean test(T t, U u)
//	3-> Consumr -->>> void accept(T t)
//	4-> BiConsumer -->> void accept(T t, U u)
//	5-> Function -->> E apply(T t) ex -->> apply(dataType, returnType)
//	6-> Bufunction -->> E apply(T t, U u) -->>apply(dataType, datatype, returnType)
//	7-> Supplier -->>  T get();
//	8-> UnaryOperator -->> obj.apply(argumentType) -->>argumentType and returnType both are same
//	9-> BinaryOperator -->> obj.apply(argument Both are same Type and returnType) 
	
	

	public static void main(String[] args) {
//		Predicate
//		Predicate<Integer> p =  x -> x>50;
//		System.out.println(p.test(5));
		
		
//		BiPredicate
//		BiPredicate<Integer, Integer> biPredicate = (x,y) -> x>y;
//		System.out.println(biPredicate.test(50, 100));
		
////		Consumer
//		Consumer<String> consumer = x -> System.out.println(x.length());
//		consumer.accept("sumit"); //5
		
////		Here we are using consumer
//		List<Integer> list = Arrays.asList(1,2,3,4,5);
//		Consumer<Integer> consumer2 = x -> System.out.println(x);
//		list.stream().forEach(consumer2);
		
		
////		BiConsumer
//		BiConsumer<String, String> biConsumer = (x,y) -> System.out.println(x + ": "+ y);
//		biConsumer.accept("sumit", "gond");
//		
////		Implementation
//		Map<String, String> map = new HashMap<>();
//		map.put("sumit", "gond");
//		map.put("sourabh", "gautam");
//		map.put("Rohit", "chauhan");
//		map.forEach(biConsumer);
		
//		Function
//		Function<Integer , Boolean> function = x -> x>50;
//		System.out.println(function.apply(15));
		
//		BiFunction
//		BiFunction<Integer, String, String> biFunction = (x,y) ->(x + " : "+ y);
//		System.out.println(biFunction.apply(1001, "java"));
//		System.out.println(biFunction.apply(1002, "sb"));
		
//		supplier
//		Supplier<String> supplier = ()->"My name is sumit";
//		System.out.println(supplier.get());
		
//		UnaryOperator
//		UnaryOperator<Integer> operator = x -> x+4;
//		System.out.println(operator.apply(5));
		
//		BinaryOperator
//		BinaryOperator<String> binaryOperator = (x,y) -> x+" "+y;
//		System.out.println(binaryOperator.apply("sumit", "gond"));
		
		
	}
}
