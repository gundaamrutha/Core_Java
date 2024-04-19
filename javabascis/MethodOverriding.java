package javabascis;
class parent_class
{
	void add()
	{
		System.out.println("Adding 3 numbers");
	}
}
public class MethodOverriding extends parent_class
{
	void add()
	{
		super.add();
		System.out.println("Adding 2 numbers");
		super.add();
	}
	public static void main(String[] args)
	{
		MethodOverriding m1=new MethodOverriding();
		m1.add();
		//m1.add();

	}

}
