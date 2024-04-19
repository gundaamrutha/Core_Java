package javaassignments;

public class SpecialChar_20A {

	public static void main(String[] args) {
		String a="A@mr utha#12!";
		//String a="Amrutha";
		int count_of_alpha=0;
		char b[]= a.toCharArray();
		boolean answer;
		for(int i=0;i<a.length();i++)
		{
			answer=Character.isAlphabetic(b[i]);
			if(answer==true)
			{
				count_of_alpha++;
			}
			answer=Character.isDigit(b[i]);
			if(answer==true)
			{
				count_of_alpha++;
			}
			answer=Character.isSpaceChar(b[i]);
			if(answer==true)
			{
				count_of_alpha++;
			}
		}
		int count_of_spclchar=a.length()-count_of_alpha++;
		if ((count_of_spclchar)==0)
		{
			System.out.println("Special characters are not present in the string");
		}
		else
		{
			System.out.println(count_of_spclchar+" Special characters are present in the string");
		}
		

	}

}
