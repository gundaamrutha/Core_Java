package javaassignments;
//Create 4 static method with different name and call it inside the main method.
public class MultipleMethods_2
{
	public static void add()
	{
		System.out.println("Addition");
	}
	
	static void subtraction()
	{
		System.out.println("Subtraction");
	}
	
	static void multiplication()
	{
		System.out.println("Multiplication");
	}
	
	static void division()
	{
		System.out.println("Division");
	}

	public static void main(String[] args) {
		add();
		System.out.println("main method");
		division();
		multiplication();
		subtraction();

	}

}
