//Find the Area of the Circle having 'pi' as static, final and Global with int radius and double radius using Scanner class
package javaassignments;

import java.util.Scanner;

public class AreaOfCircle_9 {
	
	final static double pi=3.14;

	public static void main(String[] args) {
		int r;
		double a, area, area1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius in 'real number' ");
		r=s.nextInt();
		area=pi*r*r;
		System.out.println("Area of circle " +area);
		System.out.println("Enter radius in 'decimal values' ");
		a=s.nextDouble();
		area1=pi*a*a;
		System.out.println("Area of circle " +area1);
		s.close();
	}

}
