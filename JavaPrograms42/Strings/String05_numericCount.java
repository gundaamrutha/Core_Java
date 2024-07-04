package Strings;

public class String05_numericCount
{
	static int count_of_digit=0;
	public static void main(String[] args)
	{
		
		String s1="50cent";
		char c1[]=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
		boolean b1=Character.isDigit(c1[i]);
		
		if(b1==true)
		{
			count_of_digit++;
		}
		}
		System.out.println("The number of digits in given string are -> "+count_of_digit);

	}

}
