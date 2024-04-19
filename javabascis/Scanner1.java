package javabascis;
import java.util.Scanner;

public class Scanner1 {
	public static void main(String [] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstno=s1.nextInt();
		System.out.println("Enter the first number");
		int Secondno=s1.nextInt();
		int Sum=firstno+Secondno;
		System.out.println("Addition of 2 numbers"+Sum);
	}

}
