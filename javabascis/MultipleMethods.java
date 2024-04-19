package javabascis;

public class MultipleMethods {
	
	static void add()
	{
		System.out.println("Addition");
	}
	public static void main(String[] args)
	{
		add();
		System.out.println("Main Method");
		add(); //can call the method multiple times
	}

}
