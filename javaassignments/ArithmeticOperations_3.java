package javaassignments;
//Create 4 static method to perform arithmetic operations and call it inside the main method.
public class ArithmeticOperations_3{
	public static void add()
	{
		int a=10, b=20;
		int sum=a+b;
		System.out.println("Addition is "+ sum);
	}
	static void subtraction()
	{
		int a=10, b=20;
		int subtraction=a-b;
		System.out.println("Subtraction is "+ subtraction);
	}
	static void multiplication()
	{
		int a=10, b=20;
		int multiply=a*b;
		System.out.println("Multiplication is "+ multiply);
	}
	static void division()
	{
		int a=10, b=20;
		int division=a/b;
		System.out.println("Division is "+ division);
	}
	public static void main(String[] args)
	{
		add();
		division();
		multiplication();
		subtraction();
	}
}
