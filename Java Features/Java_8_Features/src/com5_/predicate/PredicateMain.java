package com5_.predicate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//interface MyPreducate<T>{
//	boolean operation(T t);
//}
//
//public class PredicateMain {
//
//	public static void main(String[] args) {
//
//		List<Car> carlist = Arrays.asList(
//				new Car("BMW", "Blue", 5000000),
//				new Car("Mercedes", "Black", 7000000),
//				new Car("Alto", "White", 6000000),
//				new Car("Tata", "Black", 2000000)
//				);
//		System.out.println(carlist);
//		
//		
//		//default Perdicate 
//		Predicate<Car> predicate = (x) ->x.getPrice()< 6000000;
//		for(Car car : carlist) {
//			if(predicate.test(car)) {
//				System.out.println(car);
//			}
//		}
//		
////		MyPredicate
//		MyPreducate<Car> p = (x) ->x.getPrice()> 6000000;
//		for(Car car : carlist) {
//			if(p.operation(car)) {
//				System.out.println(car);
//			}
//		}
//		
////		Throught Stream Api
//		List<Car> list = carlist.stream().filter((x) ->x.getPrice()< 6000000).collect(Collectors.toList());
//		System.out.println(list);
//		
//	}
//	
//
//}

public class PredicateMain {  
    static Boolean checkAge(int age){  
        if(age>17)  
            return true;  
        else return false;  
    }  
    public static void main(String[] args){  
        // Using Predicate interface  
        Predicate<Integer> predicate =  PredicateMain::checkAge;  
        // Calling Predicate method  
        boolean result = predicate.test(25);  
        System.out.println(result);  
    }  
}  
