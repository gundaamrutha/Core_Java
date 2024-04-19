package stringfunctions;

import java.util.Arrays;

public class String3 {

	public static void main(String[] args) {
		String name="I am a student";
		String output= name.replace('a', ' ');
		System.out.println(output);
		System.out.println(name.replace('a', 'n'));
		System.out.println(name.replaceAll("[A-Z]",""));
		System.out.println(name.replaceAll("[a-z]",""));
		String name1="Hey I am Fin9";
		System.out.println(name1.replaceAll("[0-9]", ""));
		String name2="Amrutha";
		System.out.println(name2.replaceAll("[A-Z]","Manish"));
		String name3="";
		System.out.println(name.isEmpty());
		System.out.println(name3.isEmpty());
		System.out.println(name.lastIndexOf('a'));
		System.out.println(name.equalsIgnoreCase("i am A Student"));
		System.out.println(name.repeat(5));
		String s1="manish";
		char[] value1=s1.toCharArray();
		//System.out.println((value1));
		System.out.println(Arrays.toString(value1));

	}

}
