package javaassignments;
abstract class two{
	int a=10, b=20, c;
	abstract void add();
	abstract void subtract();
	void multiply(){
		System.out.println(a*b);
	}
}
abstract class one extends two{
	abstract void addition();
	abstract void subtraction();
	void division(){
		System.out.println(a/b);
	}
}
public class AbstractClass_16 extends one{
	void adding() {
		System.out.println(a+b);
	}
	void modulus() {
		System.out.println(a%b);
	}

	public static void main(String[] args) {
		AbstractClass_16 a1= new AbstractClass_16();
		a1.adding();
		a1.modulus();
		a1.division();
		a1.addition();
		a1.subtraction();
		a1.add();
		a1.subtract();
		a1.multiply();
	}
	void addition() {
		
		System.out.println("addition");
	}
	void subtraction() {
		System.out.println("Subtraction");
		
	}
	void add() {
		System.out.println("Add");	
		
	}
	void subtract() {
		System.out.println("Subtract");
	}
	
	}


