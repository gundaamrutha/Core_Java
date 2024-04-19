package Array;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		int a[]= new int[5];
		int b[]=new int[5];
		int c=b.length-1;
		a[0]=43;
		a[1]=8;
		a[2]=16;
		a[3]=23;
		a[4]=48;
		for(int i=0;i<a.length;i++)
		{
			b[c]=a[i];
			c--;
		}
		System.out.println("The Inital array is "+Arrays.toString(a));
		System.out.println("The reverse array is "+Arrays.toString(b));

	}

}
