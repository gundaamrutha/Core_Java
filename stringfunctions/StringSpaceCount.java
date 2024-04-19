package stringfunctions;

import java.util.Arrays;

public class StringSpaceCount {

	public static void main(String[] args) {
		int count_of_space=0;
		boolean answer1;
		String name="manish kumar";
		char[] a1=name.toCharArray();
	
		System.out.println(Arrays.toString(a1));
		for(int i=0;i<name.length();i++)
		{
			answer1= Character.isSpaceChar(a1[i]);
			System.out.println(answer1);
			
			if(answer1==true)
			{
				count_of_space++;
			}
			
		}
		System.out.println("The Number of spaces in the given sprint is ---> "+count_of_space++);

	}

	}


