package javabascis;

public class NestefIfElse {

	public static void main(String[] args) {
		int age=19;
		double salary=10000;
		if(age>18) //true
		{
			if(salary>8000) //true
			{
				System.out.println("Salary is grater than 8K and age is more than 18");
			}
			else
			{
				System.out.println("Salary is not greater than 8k but age is more than 18");
			}
		}
		else
		{
			System.out.println("Age is not greater than 18");
		}
	}

}
