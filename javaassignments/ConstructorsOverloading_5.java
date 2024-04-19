package javaassignments;
public class ConstructorsOverloading_5 {
	ConstructorsOverloading_5 (int a)
	{
		System.out.println(a);
	}
	ConstructorsOverloading_5 (char a)
	{
		System.out.println(a);
	}
	ConstructorsOverloading_5 (String a)
	{
		System.out.println(a);
	}
	ConstructorsOverloading_5 (boolean a)
	{
		System.out.println(a);
	}
	ConstructorsOverloading_5 (int a,char b,String c,boolean d)
	{
		System.out.print(a);
		System.out.print(","+b);
		System.out.print(","+c);
		System.out.print(","+d);
	}

	public static void main(String[] args) {
		new ConstructorsOverloading_5(10);
		new ConstructorsOverloading_5('X');
		new ConstructorsOverloading_5("Amrutha");
		new ConstructorsOverloading_5(true);
		new ConstructorsOverloading_5(20,'Z',"GroTechMinds",true);	
	}
}
