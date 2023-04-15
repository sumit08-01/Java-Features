package com4_.safevarargsAnnotation;

import java.util.ArrayList;
import java.util.List;

public class safeVarargsAnnotation {

//	@SafeVarargs  
    private void display(List<String>... products) { // Not using @SaveVarargs  
        for (List<String> product : products) {  
            System.out.println(product);  
        }  
    }  
    public static void main(String[] args) {  
    	safeVarargsAnnotation p = new safeVarargsAnnotation();  
        List<String> list = new ArrayList<String>();  
        list.add("Laptop");  
        list.add("Tablet");  
        p.display(list);  
    }     
}
