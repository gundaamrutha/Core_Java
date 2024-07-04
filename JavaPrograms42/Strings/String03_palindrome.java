package Strings;

public class String03_palindrome {

	public static void main(String[] args)
	{
		String name="DID";
		String input=name.toLowerCase();
		String reverse="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			reverse=reverse+c1;
		}
		//System.out.println(reverse);
		boolean result=input.equals(reverse);
		
		if(result==true)
			System.out.println("Input is Palindrome");
		else
			System.out.println("Input is not a Palindrome");
		

	}

}
