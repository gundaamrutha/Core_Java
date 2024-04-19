package GetAndSet;
class login
{
	private String email_id="amrutha@gmail.com"; //default email id of the system
	public String getEmail_id()
	{
		return email_id;
	}
	public void setEmail_id(String email_id)//local variable
	{
		this.email_id=email_id;
	}
	
	
	private String password="Admin*12";
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	private int age=18;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class GetandSET {
	public static void main(String[] args)
	{
		login l1=new login();
		l1.setEmail_id("new@gmail.com");
		System.out.println(l1.getEmail_id());
		
		l1.setPassword("newAdmin*12");
		System.out.println(l1.getPassword());
		
		l1.setAge(24);
		System.out.println(l1.getAge());
	}

}
