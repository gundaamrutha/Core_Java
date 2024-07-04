package Arrays;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		int rollno[]=new int[5];
		rollno[0]=21;
		rollno[1]=20;
		rollno[2]=31;
		rollno[3]=121;
		rollno[4]=45;
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(rollno[i]);  //printing using for loop
		}
		
		System.out.println(Arrays.toString(rollno));  //printing using string concept
		
		
		// let's do a problem to store 5 names together
		
		String name[]=new String[5];
		name[0]="Amrutha";
		name[1]="Anjali";
		name[2]="Lakshmi";
		name[3]="Gurunadham";
		name[4]="Gunda";
		System.out.println(Arrays.toString(name));

	}

}
