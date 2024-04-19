package stringfunctions;

public class Palindrome {

	public static void main(String[] args)
	{
		String input="radar";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char rev=input.charAt(i);
			output=output+rev;
		}
		
		System.out.println(output);
		if((input)==(output)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println(input +" Not a Palindrome");
		}
		
		if(input.equals(output))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}

	}

}
