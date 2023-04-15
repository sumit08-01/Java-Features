package com5_.ofMethods;

import java.util.Map;

public class MapOf {

	public static void main(String[] args) {  
        Map<Integer,String> map = Map.of(101,"JavaFX",102,"Hibernate",103,"Spring MVC", 102,"sumit"); 
//        Map<Integer,String> map = Map.of(101,"JavaFX",102,"Hibernate",103,"Spring MVC", 102,"sumit"); -->. Thid line give error , don't allow duplicate keys
        for(Map.Entry<Integer, String> m : map.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());  
        }  
    }  
}
