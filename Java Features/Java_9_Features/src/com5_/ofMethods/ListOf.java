package com5_.ofMethods;

import java.util.List;

public class ListOf {

	public static void main(String[] args) {  
        List<String> list = List.of("Java","JavaFX","Spring","Hibernate","JSP");  
        for(String l:list) {  
            System.out.println(l);  
        }  
    }  
}
