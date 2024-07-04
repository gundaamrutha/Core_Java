package Strings;

public class String02_reverse {

	public static void main(String[] args)
	{
		/*String name="Amrutha"; //reverse the string
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}*/
		
		String name="My name is Amrutha Gunda"; //reverse using string concept.imp
		String input=name.toLowerCase();
		String reverse="";
		for(int i=input.length()-1;i>0;i--)
		{
			char c1=input.charAt(i);
			//System.out.print(c1);
			reverse=reverse+c1;
		}
		System.out.println(reverse);
		

	}

}
