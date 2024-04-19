package javabascis;

class State_Class
{
	static void multiple()
	{
		System.out.println("multiply");
	}
	
	void division()
	{
		System.out.println("division");
	}
	
}


public class SingleLevelInhertence extends State_Class
{
	
	static void add()
	{
		System.out.println("adding");
		
	}
	
	void subtracting()
	{
		System.out.println("Subtracting");
	}

	public static void main(String[] args) {
		
		add();
		SingleLevelInhertence i= new SingleLevelInhertence();
		i.subtracting();
		multiple();
		i.division();
		

	}
}
	
	

