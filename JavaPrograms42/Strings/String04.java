package Strings;

import java.util.Arrays;

//contains, endsWith

public class String04 {

	public static void main(String[] args)
	{
		String name="i am amrutha";   
		boolean answer=name.contains("am");
		System.out.println(answer);
		
		boolean answer1=name.endsWith("amrutha");
		System.out.println(answer1);
		
		String s1="manual";
		char c1[] = s1.toCharArray();
		System.out.println(Arrays.toString(c1));

	}

}
