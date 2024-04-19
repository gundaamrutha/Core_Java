//Find the Circumference of the Circle having 'pi' as static, final and Global and via Scanner class

package javaassignments;

import java.util.Scanner;

public class CircumferenceOfCircle_10 {
	static double pi=3.14;

	public static void main(String[] args) {
		double r, circumference;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius");
		r=s.nextInt();
		circumference=2*pi*r;
		System.out.println("circumference of circle " +circumference);

	}

}
