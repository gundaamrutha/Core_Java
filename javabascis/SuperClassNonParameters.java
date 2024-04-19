package javabascis;


	class child
	{
		child(int a)
		{
			System.out.println("Mentor Class to help students");
		}
	}

	public class SuperClassNonParameters extends child{
		SuperClassNonParameters()
		{
			super(10); //super calling statement
			System.out.println("Student Class to seek help");
		}

		public static void main(String[] args)
		{
			SuperClassNonParameters s1=new SuperClassNonParameters();
			

		}
		

	}


