package javabascis;
abstract class Google_code
{
	abstract void login(); //abstract method
	abstract void registration(); //abstract method
}

public class AbstractClass extends Google_code
{

	public static void main(String[] args)
	{
		AbstractClass a1=new AbstractClass();
		a1.login();
		a1.registration();
	}

	@Override
	void login()
	{
		System.out.println("Login Logic");
		
	}

	@Override
	void registration()
	{
		System.out.println("registration Logic");
		
	}

}
