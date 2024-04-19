package stringfunctions;

public class VerticalName {
	static void printfromReverse()
	{
		String name="AmruthaGunda";
		for(int i=name.length()-1;i>=0;i--)
		{
			char a1=name.charAt(i);
			System.out.println(a1);
		}
		
	}
	

	public static void main(String[] args) {
		printfromReverse();
		System.out.println("============================");
		String name="AmruthaGunda";
		for(int i=0;i<name.length();i++)
		{
			char a1=name.charAt(i);
			System.out.println(a1);
		}
		
		

	}

}
