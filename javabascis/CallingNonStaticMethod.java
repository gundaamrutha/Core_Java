
package javabascis;

public class CallingNonStaticMethod {
	void add()
	{
	int a=100;
	int b=200;
	System.out.println(a+b);
	}
	void sub()
	{
	int a=100;
	int b=200;
	System.out.println(a-b);
	}
	
	public static void main(String [] args)
	{
		CallingNonStaticMethod m1=new CallingNonStaticMethod();
		m1.add();
		m1.sub();
	}

}
