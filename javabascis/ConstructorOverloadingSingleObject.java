package javabascis;

public class ConstructorOverloadingSingleObject
{
	ConstructorOverloadingSingleObject(char b)
	{
		System.out.println("5");
	}
	ConstructorOverloadingSingleObject(String b)
	{
		System.out.println("4");
	}
	ConstructorOverloadingSingleObject(int a,int b)
	{
		this("Amrutha");
		System.out.println("1");
	}
	ConstructorOverloadingSingleObject(double a)
	{
		this(3,2);
		System.out.println("2");
	}
	ConstructorOverloadingSingleObject()
	{
		this(4.5);
		System.out.println("3");
	}
	public static void main(String[] args)
	{
		new ConstructorOverloadingSingleObject(); //one object for 5 constructor
		
	}

}
