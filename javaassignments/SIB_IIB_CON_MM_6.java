package javaassignments;

public class SIB_IIB_CON_MM_6 {
	static
	{
		System.out.println("I am SIB");
	}
	{   
		System.out.println("I am IIB");
	}
	SIB_IIB_CON_MM_6() 
	{
		System.out.println("I am constructor");
	}

	public static void main(String[] args) {
		System.out.println("I am main method");
		SIB_IIB_CON_MM_6 o1=new SIB_IIB_CON_MM_6();
		SIB_IIB_CON_MM_6 o2=new SIB_IIB_CON_MM_6();
	}
}


