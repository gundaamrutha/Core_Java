package Strings;

public class String01 {

	public static void main(String[] args)
	{
		String a="I love my India";
		
		char first_char=a.charAt(0);
		System.out.println(first_char);
		
		int index=a.indexOf('m');
		System.out.println(index);
		
		String t1="   This is my class    ";
		//System.out.println(t1);
	    System.out.println(t1.trim());
	    
	    String c="Hello Abhishek";
	    String c1=c.substring(3);
	    System.out.println(c1);
	    String c2=c.substring(3,9);
	    System.out.println(c2);

	}

}
