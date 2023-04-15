package com1_.lambdaFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

////Java Lambda Expression Example: No Parameter
//interface Sayable {
//	public String say();
//}
//
//public class LambdaExpressionExample {
//	public static void main(String[] args) {
//		Sayable s = () -> {
//			return "I have nothing to say.";
//		};
//		System.out.println(s.say());
//	}
//}


////Java Lambda Expression Example: Single Parameter
//interface Sayable{  
//    public String say(String name);  
//}  
//  
//public class LambdaExpressionExample{  
//    public static void main(String[] args) {  
//      
//        // Lambda expression with single parameter.  
//        Sayable s1=(name)->{  
//            return "Hello, "+name;  
//        };  
//        System.out.println(s1.say("Sonoo"));  
//          
//        // You can omit function parentheses    
//        Sayable s2= name ->{  
//            return "Hello, "+name;  
//        };  
//        System.out.println(s2.say("Sonoo"));  
//    }  
//}  

//Java Lambda Expression Example: Multiple Parameters and with return keyword

//interface Addable{
////	public void sum(int a, int b);
//	public int sum(int c, int d);
//}
//
//public class LambdaExpressionExample{
//	
//	public static void main(String[] args) {
//		
////		Addable addable = (a,b)-> {
////			System.out.println("sum is " + (a+b));
////		};
////		addable.sum(3, 4);
//		
//		Addable addable2 = (a,b) -> {
//			return (a+b);
//		};
//		System.out.println(addable2.sum(4, 7));
//	}
//}


//Java Lambda Expression Example: Foreach Loop
//public class LambdaExpressionExample{  
//    public static void main(String[] args) {  
//          
//        List<String> list=new ArrayList<String>();  
//        list.add("ankit");  
//        list.add("mayank");  
//        list.add("irfan");  
//        list.add("jai");  
//          
//        list.forEach(  
//            (n)->System.out.println(n)  
//        );  
//    }  
//} 

//Java Lambda Expression Example: Filter Collection Data
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class LambdaExpressionExample{  
    public static void main(String[] args) {  
        List<Product> list=new ArrayList<Product>();  
        list.add(new Product(1,"Samsung A5",17000f));  
        list.add(new Product(3,"Iphone 6S",65000f));  
        list.add(new Product(2,"Sony Xperia",25000f));  
        list.add(new Product(4,"Nokia Lumia",15000f));  
        list.add(new Product(5,"Redmi4 ",26000f));  
        list.add(new Product(6,"Lenevo Vibe",19000f));  
          
        // using lambda to filter data  
        Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);  
          
        // using lambda to iterate through collection  
        filtered_data.forEach(  
                product -> System.out.println(product.name+": "+product.price)  
        );  
    }  
}  

