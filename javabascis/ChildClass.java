package javabascis;
class ParentClass
{
	static void parent()
	{
		System.out.println("I am parent calss method");
	}
}

public class ChildClass extends ParentClass
{
	static void child()
	{
		System.out.println("I am in Child class");
	}

	public static void main(String[] args) {
		child();
		parent();

	}

}
