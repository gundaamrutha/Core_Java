package javaassignments;
import java.util.*;

public class Palindrome_17 {

	public static void main(String[] args) {
		String output ="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any word to find whether it is a Palindrome or not");
		String s1=s.next();
		for(int i=s1.length()-1;i>=0;i--) {
			char rev=s1.charAt(i);
			output = output+rev;
		}
		if(s1.equals(output)) {
			System.out.println(s1 +" is a palindrome");
		}
		else {
			System.out.println(s1 +" is not a palindrome");
		}

	}

}
