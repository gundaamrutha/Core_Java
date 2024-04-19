package javabascis;

public class IfElseif {
	public static void main(String[] args) {
		int a=100;
		int b=200;
		int c=300;
		if(a>b)
		{
			System.out.println("One");
		}
		else if(b>c)
		{
			System.out.println("Two");
		}
		else if(b>=c)
		{
			System.out.println("Three");
		}
		else if(b==c)
		{
			System.out.println("Four");
		}
		else if(b<=c)
		{
			System.out.println("Five");
		}
		else if(b!=c)
		{
			System.out.println("Six");
		}
		else
		{
			System.out.println("Seven");
		}
	}
	

}
