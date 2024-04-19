package javabascis;
class GrandParent_Class
{
	GrandParent_Class()
	{
		System.out.println("3");
	}
}
class Parent_Class extends GrandParent_Class
{
	Parent_Class()
	{
	System.out.println("2");
    }
}
public class Myclass extends Parent_Class {
	Myclass()
	{
		System.out.println("1");
	}

	public static void main(String[] args) {
		
	}

}
