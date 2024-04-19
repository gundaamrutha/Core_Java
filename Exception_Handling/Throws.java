package Exception_Handling;

public class Throws {

	public static void main(String[] args) throws NullPointerException,InterruptedException {
		{
			//throw new NullPointerException(); //1st syntax
			
			Thread.sleep(2000);
			throw new NullPointerException("Sorry file name is empty"); //2nd syntax
			
		}

	}

}
