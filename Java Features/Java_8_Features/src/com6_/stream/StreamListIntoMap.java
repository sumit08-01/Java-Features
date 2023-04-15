package com6_.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class ProductM{  
    int id;  
    String name;  
    float price;  
    public ProductM(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
  
public class StreamListIntoMap {  
    public static void main(String[] args) {  
        List<ProductM> productsList = new ArrayList<ProductM>();  
  
        //Adding Products  
        productsList.add(new ProductM(1,"HP Laptop",25000f));  
        productsList.add(new ProductM(2,"Dell Laptop",30000f));  
        productsList.add(new ProductM(3,"Lenevo Laptop",28000f));  
        productsList.add(new ProductM(4,"Sony Laptop",28000f));  
        productsList.add(new ProductM(5,"Apple Laptop",90000f));  
          
        // Converting Product List into a Map  
        Map<Integer,String> productPriceMap =   
            productsList.stream()  
                        .collect(Collectors.toMap(p->p.id, p->p.name)); 
              
        System.out.println(productPriceMap);  
    }  
}  
