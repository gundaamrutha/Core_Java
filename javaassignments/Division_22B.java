package javaassignments;

import java.util.Scanner;

public class Division_22B {

	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num%3==0&&num%5==0)
			System.out.println("CAT&FROG");
		else if(num%3==0)
			System.out.println("CAT");
		else if(num%5==0)
			System.out.println("FROG");
		else
			System.out.println("Number is neither divisible by 3 nor by 5");

	}

}
