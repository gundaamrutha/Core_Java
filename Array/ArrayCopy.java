package Array;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int b[]=new int[5];
		int a[]= new int[5];
		a[0]=43;
		a[1]=8;
		a[2]=16;
		a[3]=23;
		a[4]=48;
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("The first array is "+Arrays.toString(a));
		System.out.println("The second array is "+Arrays.toString(b));
		

	}

}
