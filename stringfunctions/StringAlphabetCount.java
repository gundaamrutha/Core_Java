package stringfunctions;

import java.util.Arrays;

public class StringAlphabetCount {

	public static void main(String[] args) {
		int count_of_alpha=0;
		boolean answer1;
		String name="manish1456787654";
		char[] a1=name.toCharArray();
	
		System.out.println(Arrays.toString(a1));
		for(int i=0;i<name.length();i++)
		{
			answer1= Character.isAlphabetic(a1[i]);
			System.out.println(answer1);
			
			if(answer1==true)
			{
				count_of_alpha++;
			}
			
		}
		System.out.println("The Number of Alphabets in the given sprint is ---> "+count_of_alpha);

	}

}
