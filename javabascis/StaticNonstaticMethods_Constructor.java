package javabascis;

public class StaticNonstaticMethods_Constructor {
	static void add()
	{
		int a=20;
		int b=60;
		int sum=a+b;
		System.out.println("sum is "+sum);
	}
	void multi()
	{
		int a=20;
		int b=60;
		int multi=a*b;
		System.out.println("multi is "+multi);
	}
	StaticNonstaticMethods_Constructor()
	{
		System.out.println("this is constructor");
	}

	public static void main(String[] args) {
		add(); //static method
		StaticNonstaticMethods_Constructor s1=new StaticNonstaticMethods_Constructor(); //constructor
		s1.multi(); //non-static

	}

}
