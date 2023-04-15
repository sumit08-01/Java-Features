package com.core_java.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorComparable {

	public static void main(String[] args) {

		// Sort value based on it's last digit
		Comparator<Integer> comparable = new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				if(i%10 > j%10)
					return 1;
				else 
					return -1;
			}
		};
		
		List<Integer> l = new ArrayList<>();
		l.add(43);
		l.add(87);
		l.add(91);
		l.add(62);
		
//		Collections.sort(l);//[43, 62, 87, 91] --> Based on sort(inbuilt method)
		Collections.sort(l, comparable);
		System.out.println(l); 
	}

}
