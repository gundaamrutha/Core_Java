package Exception_Handling;

public class EH1 {

	public static void main(String[] args) {
		try
		{
		long c=1/0;
		System.out.println(c);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("I have an exception called AE");
		}

	}

}
