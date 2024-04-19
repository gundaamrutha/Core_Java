package javabascis;

public class GlobalVariable
{
	int z=100; //static Global variable
	static double pi=3.14; //Non-static Global variable
	static char gender='F';
	static int age;
	String name;
	static boolean answer;
	void add()
	{
		int a=10;
		int b=20;
		String name; //Local variable
		name="Amrutha";
		System.out.println(name);
	}
	void subtract()
	{
		int a=10;
		int b=20;
	}
	static void multi()
	{
		System.out.println(pi);
	}
	public static void main(String[] args) 
	{
		answer=true;
		System.out.println(pi);
		System.out.println("age");
		System.out.println("name");
		System.out.println("answer");
		GlobalVariable g1=new GlobalVariable();
		System.out.println(g1.z);
		g1.add();

	}

}
