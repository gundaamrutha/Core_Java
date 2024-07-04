package Upcasting;
class Delhi
{
	void vehicles()
	{
		
	}
	void buses()
	{
		
	}
		
}

public class Banglore extends Delhi
{
	void add()
	{
		
	}

	public static void main(String[] args) {
		Delhi d1=new Banglore();
		d1.vehicles();
		d1.buses();
		//d1.add();// with the help of parent class reference variable d1 we can not use child/own class properties 

	}

}
