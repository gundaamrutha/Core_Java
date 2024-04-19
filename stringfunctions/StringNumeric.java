package stringfunctions;

import java.util.Arrays;

public class StringNumeric {

	
	public static void main(String[] args) {
		boolean answer1;
		String name="manish1";
		char[] a1=name.toCharArray();
	
		System.out.println(Arrays.toString(a1));
		for(int i=0;i<name.length();i++)
		{
			answer1= Character.isDigit(a1[i]);
			System.out.println(answer1);
			
			if(answer1==true)
			{
				System.out.println("Numeric is present at index= "+i);
			}
		}
		

	}

}
