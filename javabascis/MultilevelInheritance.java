package javabascis;
class GrandParentClass
{
	static void fetching_username()
	{
		
	}
}
class Parentclass1 extends GrandParentClass
{
	static void login_using_UN()
	{
		
	}
}

public class MultilevelInheritance extends Parentclass1
{
   static void Testcase1_Adding_to_cart()
   {
	   
   }
	public static void main(String[] args) {
		
		Testcase1_Adding_to_cart();
		login_using_UN();
		fetching_username();		
		

	}

}
