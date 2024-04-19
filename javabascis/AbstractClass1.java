package javabascis;

public class AbstractClass1 extends Facebook_Class{

	public static void main(String[] args) {
		AbstractClass1 a1=new AbstractClass1();
		a1.add();
		subtract();
		a1.modulus();
		a1.multiple();
		a1.division();
	}
	void modulus()
	{
		System.out.println("modulus");
	}

	@Override
	void multiple()
	{
		System.out.println("multiple logic");
	}

	@Override
	void division()
	{
		System.out.println("division logic");	
	}

}
	
abstract class Facebook_Class
{
	void add() //concrete method1
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	static void subtract() //concrete method2
	{
		System.out.println(Math.subtractExact(10,20));
	}
	abstract void multiple(); //abstract method1
	abstract void division(); //abstract method2
}
