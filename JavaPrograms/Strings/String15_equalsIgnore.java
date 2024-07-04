package Strings;

import java.util.Arrays;

public class String15_equalsIgnore {

	public static void main(String[] args) {
		String s1="Amrutha Gunda";
		boolean b1= s1.equalsIgnoreCase("amrutha gunDA");   //ignores capital and small
		System.out.println(b1);
		
		String s2="";
		System.out.println(s2.isEmpty());
		
		String s3="manish";
		System.out.println(s3.endsWith("h"));
		System.out.println(s3.endsWith("a"));
		
		String s4="my name is amrutha";  //important //Q: convert the string into array my in position 0 name in 1 is in 3 amrutha in 4
		String s5[]=s4.split(" ");  // spilt this given string where ever there is space and store it an array
        //s5[0]=my
		//s5[1]=name
		//s5[2]=is
		//s5[3]=amrutha
		
		System.out.println(s5[0]);
		
		System.out.println(Arrays.toString(s5));
		
		String s6[]=s4.split(" ",2); //limit 2 only 2 parts (0,1)
		System.out.println(Arrays.toString(s6));
		
		String q="software";
		String answer=q.repeat(10);
		System.out.println(answer);
	}

}
