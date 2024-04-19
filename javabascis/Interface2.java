package javabascis;
interface insta
{
	void method3();
	void method4();
}
abstract class facebook implements insta
{
	abstract void method1();
	abstract void method2();
	static void add()
	{
		System.out.println("add");
	}
}
public class Interface2 extends facebook {

	public static void main(String[] args) {
		add();
		Interface2 i=new Interface2();
		i.method1();
		i.method2();
		i.method3();
		i.method4();
		
	}

	@Override
	public void method3() {
		
		System.out.println("method 3");
	}

	@Override
	public void method4() {
		
		System.out.println("method 4");
	}

	@Override
	void method1() {
		
		System.out.println("method 1");
	}

	@Override
	void method2() {
		System.out.println("method 2");
		
	}

}
