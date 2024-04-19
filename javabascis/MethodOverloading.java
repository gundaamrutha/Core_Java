package javabascis;

public class MethodOverloading
{
	void add()
	{
		System.out.println("Addition");
	}
	void add(int a)
	{
		System.out.println(a+6);
	}
	void add(int a,double b)
	{
		System.out.println(a+b);
	}
	void add(double b,int a)
	{
		System.out.println(a+b);
	}
	static void add(int a,double b, String c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		add(10,20.6,"Amrtha");
		MethodOverloading m1 = new MethodOverloading();
		m1.add();
		m1.add(5);
		m1.add(9,3.2);
		m1.add(3.2,9);
		add(5,3.2,"Amrutha");
	}

}
