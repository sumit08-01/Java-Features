package com6_.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class ProductL{  
    int id;  
    String name;  
    float price;  
    public ProductL(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
  
public class StreamListIntoSet {  
    public static void main(String[] args) {  
        List<ProductL> productsList = new ArrayList<ProductL>();  
  
        //Adding Products  
        productsList.add(new ProductL(1,"HP Laptop",25000f));  
        productsList.add(new ProductL(2,"Dell Laptop",30000f));  
        productsList.add(new ProductL(3,"Lenevo Laptop",28000f));  
        productsList.add(new ProductL(4,"Sony Laptop",28000f));  
        productsList.add(new ProductL(5,"Apple Laptop",90000f));  
        productsList.add(new ProductL(6,"Apple Laptop",8000f));  
          
        // Converting product List into Set  
        Set<Float> productPriceList =   
            productsList.stream()  
            .filter(product->product.price < 30000)   // filter product on the base of price  
            .map(product->product.price)  
            .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
        System.out.println(productPriceList);  
    
    }
}