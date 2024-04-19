package javaassignments;
import java.util.Scanner;
public class Switchcase_15 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the option number\n 1.Depoist\n 2.Withdrwal\n 3.Loan\n 4.Balance");
		int a=s.nextInt();
		switch(a)
		{
		case 1:
		{
			System.out.println("Depoist");
			break;
		}
		
		case 2:
		{
			System.out.println("Withdraw");
			break;
		}
		
		case 3:
		{
			System.out.println("Loan");
			break;
		}
		
		case 4:
		{
			System.out.println("Balance");
			break;
		}
		default:
			System.out.println("Please select the above options");
			break;
	}
}
}
