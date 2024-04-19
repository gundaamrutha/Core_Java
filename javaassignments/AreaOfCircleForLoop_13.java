//Area of Circle with human input at the Run time for 10 times
package javaassignments;
import java.util.*;

public class AreaOfCircleForLoop_13 {
	static double pi=3.14;
	public static void main(String[] args) {
		double r,area;
		for(int i=1;i<=10;i++)
		{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius of the circle");
		r=s.nextDouble();
		area=pi*r*r;
		System.out.println("Area of circle is "+area);
		}
	}
}
