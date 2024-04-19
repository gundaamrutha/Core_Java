package javaassignments;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num%3==0)
		{
			if(num%5==0&&num%3==0)
			    System.out.println("FROG&CAT");
			else
				System.out.println("FROG");	
		}
		else
		{
			if(num%5==0)
			{
				System.out.println("CAT");		
			}
			else
				System.out.println("not divisible by 3/5");
		}
		
	}

}
}
