package javabascis;
interface Google_Authentication
{
	void login();
	void registration();
}

public class Interface implements Google_Authentication {

	public static void main(String[] args) {
		Google();
		Interface i=new Interface();
		i.login();
		i.registration();

	}
	
	static void Google()
	{
		System.out.println("Google");
	}
	@Override
	public void login() 
	{
		System.out.println("Login");
		
	}

	@Override
	public void registration() {
		
		System.out.println("registration");
	}

}
