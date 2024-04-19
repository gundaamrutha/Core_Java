package javabascis;

public class ThisExample
{
	String name;
	int age;
	double salary;
	void student_details(String myname,int age,double salary)
	{
		System.out.println("I am "+name +" and my age is "+age+" and my heavy salary is"+salary);
	    this.name=myname;
	    this.age=age;
	}

	public static void main(String[] args) {
		ThisExample L1=new ThisExample();
		L1.student_details("Amrutha",23,83723);
		System.out.println(L1.name); //null
		System.out.println(L1.age); //0
		System.out.println(L1.salary); //0.0
		
		
	}

}
