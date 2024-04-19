package Array;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args)
	{
		int age[]=new int[5];
		age[0]=19;
		age[1]=90;
		age[2]=5;
		age[3]=77;
		age[4]=51;
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println(age[3]);
		System.out.println(age[4]);

		for(int i=0;i<5;i++)
		{
			System.out.println(age[i]);
		}
		
		
		// one more way to print arrays
		System.out.println(Arrays.toString(age));
	}

}

