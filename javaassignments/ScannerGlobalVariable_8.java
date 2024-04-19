package javaassignments;

import java.util.Scanner;

public class ScannerGlobalVariable_8 {
	static float a,b,c;
	static void add() {
		System.out.println("Enter the first digit for addition");
		Scanner s=new Scanner(System.in);
		a=s.nextFloat();
		System.out.println("Enter the second digit for addition");
		b=s.nextFloat();
		c=a+b;
		System.out.println("Addition of two numbers" + c);
	}
	static void sub() {
		System.out.println("Enter the first digit for subtraction");
		Scanner s=new Scanner(System.in);
		a=s.nextFloat();
		System.out.println("Enter the second digit for subtraction");
		b=s.nextFloat();
		c=a-b;
		System.out.println("Subtraction of two numbers" + c);
	}
	static void multiply() {
		System.out.println("Enter the first digit for multiplication");
		Scanner s=new Scanner(System.in);
		a=s.nextFloat();
		System.out.println("Enter the second digit for multiplication");
		b=s.nextFloat();
		c=a*b;
		System.out.println("Multiplication of two numbers" + c);
	}
	static void division() {
		System.out.println("Enter Divisor");
		Scanner s=new Scanner(System.in);
		a=s.nextFloat();
		System.out.println("Enter Dividend");
		b=s.nextFloat();
		c=a/b;
		System.out.println("Quotient is" + c);
	}
	static void remain() {
		System.out.println("Enter Divisor");
		Scanner s=new Scanner(System.in);
		a=s.nextFloat();
		System.out.println("Enter Dividend");
		b=s.nextFloat();
		c=a%b;
		System.out.println("remainder is" + c);
	}
	public static void main(String[] args) {
		add();
		sub();
		multiply();
		division();
		remain();
	}

}
