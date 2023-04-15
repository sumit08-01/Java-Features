package com1_.TextBlock;

public class TextBlock {

	public static void main(String[] args) {

		
		String str = """
					Line 1 
					Line 2
					Line 3""";
			
//				System.out.println(str);
				
		String str1 = """
			Line 1 
				"Line 2"
				Line 3
					Line 4
					Line 5 
						line6""";
		
		System.out.println(str1);
		
		String str2 = """
				Line 1 : %s
				Line 2 : %d
				Line 3
				Line 4
				Line 5 
				line6""".formatted("kuch String", 32);
		
		System.out.println(str2);
		
				
	}

}
