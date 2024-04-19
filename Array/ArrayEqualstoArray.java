package Array;

import java.util.Arrays;

public class ArrayEqualstoArray {

	public static void main(String[] args) {
		int number[]=new int[3];
		int number2[]=new int[3];
		number[0]=90;
		number[1]=70;
		number[2]=34;
		number2[0]=90;
		number2[1]=70;
		number2[2]=34;
		
		boolean answer=Arrays.equals(number, number2);
		System.out.println(answer);

	}

}
