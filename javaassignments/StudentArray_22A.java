package javaassignments;

import java.util.Arrays;

public class StudentArray_22A {

	public static void main(String[] args) {
		int rollno[]=new int[5];
		String[] name=new String[5];
		char[] gender=new char[5];
		long[] phnno=new long[5];
		rollno[0]=1;
		rollno[1]=2;
		rollno[2]=3;
		rollno[3]=4;
		rollno[4]=5;
		name[0]="Kushal";
		name[1]="Kushal P";
		name[2]="Vishal Prasad";
		name[3]="Monica Rawat";
		name[4]="Kushal";
		gender[0]='M';
		gender[1]='M';
		gender[2]='M';
		gender[3]='F';
		gender[4]='M';
		phnno[0]=728782;
		phnno[1]=949000;
		phnno[2]=913305;
		phnno[3]=651382;
		phnno[4]=917705;	
		System.out.print("Name ");
		for(int i=0;i<name.length;i++)
		{
			System.out.print(name[i]);
			if(i==4)
			System.out.println(" ");
			else
			System.out.print(" ");
		}
		System.out.print("Gender ");
		for(int i=0;i<gender.length;i++)
		{
			System.out.print(gender[i]);
			if(i==4)
			System.out.println(" ");
			else
			System.out.print(" ");
		}
		System.out.print("Mobile Number ");
		for(int i=0;i<phnno.length;i++)
		{
			System.out.print(phnno[i]);
			if(i==4)
			System.out.println(" ");
			else
			System.out.print(" ");
		}
		System.out.print("Roll number ");
		for(int i=0;i<rollno.length;i++)
		{
			System.out.print(rollno[i]);
			if(i==4)
			System.out.println(" ");
			else
			System.out.print(" ");
		}
		//System.out.println(Arrays.toString(rollno));
		//System.out.println(Arrays.toString(name));
		//System.out.println(Arrays.toString(gender));
		//System.out.println(Arrays.toString(phnno));

	}

}
