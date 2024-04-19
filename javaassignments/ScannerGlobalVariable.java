package javaassignments;

import java.util.Scanner;

public class ScannerGlobalVariable {
	static float a;
	static float b;
	Scanner s=new Scanner(System.in);  // question is can't we define scanner globally and can use it?
	static void add()
	{
		a= s.nextFloat();
		b= s.nextFloat();
	}

	public static void main(String[] args) {
		add();

	}

}
