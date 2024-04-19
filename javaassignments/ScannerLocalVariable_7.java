// Execute the Scanner Class with all the methods using local Variable

package javaassignments;
import java.util.*;

public class ScannerLocalVariable_7 {
	
	public static void add()
	{
		float a, b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first value for addition");
		a= s.nextFloat();
		System.out.println("Enter second value for addition");
		b=s.nextFloat();
		float sum=a+b;
		System.out.println("Addition is "+ sum);
	}
	static void subtraction()
	{
		float a, b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first value for subtarction");
		a= s.nextFloat();
		System.out.println("Enter second value for subtraction");
		b=s.nextFloat();
		float sub=a-b;
		System.out.println("Subtraction is "+ sub);
		
	}
	static void multiplication()
	{
		float a, b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first value for multiplication");
		a= s.nextFloat();
		System.out.println("Enter second value for multiplication");
		b=s.nextFloat();
		float multiply=a*b;
		System.out.println("Multiplication is "+ multiply);
	}
	static void division()
	{
		float a, b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first value for division");
		a= s.nextFloat();
		System.out.println("Enter second value for division");
		b=s.nextFloat();
		float division=a/b;
		System.out.println("Division is "+ division);
		s.close();
		
	}

	public static void main(String[] args) {
	add();
	subtraction();
	multiplication();
	division();
	
	}

}
