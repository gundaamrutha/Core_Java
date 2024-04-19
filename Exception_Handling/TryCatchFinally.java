package Exception_Handling;

import java.util.InputMismatchException;

public class TryCatchFinally {

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
		catch(NullPointerException a2)
		{
			System.out.println("I have an exception called AE");
		}
		catch(InputMismatchException a3)
		{
			System.out.println("I have an exception called AE");
		}
		catch(ArrayIndexOutOfBoundsException a4)
		{
			System.out.println("I have an exception called AE");
		}
		finally
		{
			System.out.println("Here you can have some common action ");
		}

	}

}
