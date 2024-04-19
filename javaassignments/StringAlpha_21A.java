package javaassignments;

import java.util.Scanner;

public class StringAlpha_21A {
	public static void main(String[] args) {
		int count_of_alpha=0;
		boolean answer1;
		System.out.println("Enter anything to check if it consists of only alphabets or not");
		Scanner s=new Scanner(System.in);
		String name=s.next();
		char[] a1=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			answer1= Character.isAlphabetic(a1[i]);
			
			if(answer1==true)
			{
				count_of_alpha++;
			}

}
		if(count_of_alpha==a1.length)
			System.out.println("String consists of only Alpha");
		else
			System.out.println("String doesn't consists of only Alpha");
	}
}
