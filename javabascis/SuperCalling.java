package javabascis;
class Mentor
{
	Mentor()
	{
		System.out.println("Mentor Class to help students");
	}
}

public class SuperCalling extends Mentor{
	SuperCalling()
	{
		super(); //super calling statement
		System.out.println("Student Class to seek help");
	}

	public static void main(String[] args)
	{
		SuperCalling s1=new SuperCalling();
		

	}
	

}
