package com4_.ToArrayCollectionNewFunction;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArray {

	public static void main(String[] sumit) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Sumit");
		list.add("Gond");
		
		System.out.println(list);
		System.out.println(list.getClass());
		
		String[] arrStr = list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(arrStr));
		System.out.println(Arrays.toString(arrStr).getClass());
		
		
	}

}
