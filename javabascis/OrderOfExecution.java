package javabascis;

public class OrderOfExecution {
	static //SIB
	{
		System.out.println("I am SIB");
	}
	{   //IIB
		System.out.println("I am IIB");
	}
	OrderOfExecution() //constructor
	{
		System.out.println("I am constructor");
	}

	public static void main(String[] args) {
		System.out.println("I am main method");
		OrderOfExecution o1=new OrderOfExecution();
		OrderOfExecution o2=new OrderOfExecution();
	}

}
