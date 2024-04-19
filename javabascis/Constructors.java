package javabascis;

public class Constructors {

	Constructors() //constructor
	{
		System.out.println("this is my constructor");
    }
	public static void main(String[] args) 
	{
		System.out.println("main method");
		Constructors c1=new Constructors(); // 1st syntax of creating an object
		new Constructors(); //2nd syntax of creating an object
	    	
	}

}