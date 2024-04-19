package javaassignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner_20B {

	public static void main(String[] args) {
		int a[]=new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			int b=i+1;
			System.out.println("Enter "+b+" digit in the array" );
			Scanner s=new Scanner(System.in);
			a[i]=s.nextInt();
		}
		
		System.out.println("Printing the Array"+Arrays.toString(a));
	}

}
