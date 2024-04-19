package javaassignments;

//Create 5 static methods and 5 non static methods and call it inside the main method

public class StaticNonstaticMethods_4 {
	static void add(){
		int a=20;
		int b=30;
		int sum=a+b;
		System.out.println("static method addition is " + sum);
	}
	static void sub() {
		int a=34;
		int b=21;
		int sub=a-b;
		System.out.println("static method subtraction is " + sub);	 
	}
	static void mul() {
		int a =187;
		int b =191;
		int mul=a*b;
		System.out.println("static method multiplication is " + mul);
	}
	static void div() {
		int a=912;
		int b=83;
		int div=a/b;
		System.out.println("static metod division is " + div);
	}
	static void remainder() {
		int a=82;
		int b=7;
		int rem=a%b;
		System.out.println("static method remainder is " + rem);
	}
		void addition(){
			int a=20;
			int b=30;
			int sum=a+b;
			System.out.println("non-static method addition is " + sum);
		}
		void subtraction() {
			int a=34;
			int b=21;
			int sub=a-b;
			System.out.println("non-static method subtraction is" + sub);	
		}
		void multiplication() {
			int a =187;
			int b =191;
			int mul=a*b;
			System.out.println("non-static method multiplication is " + mul);
		}
		void division() {
			int a=912;
			int b=83;
			int div=a/b;
			System.out.println("non-static metod division is " + div);
		}
		void remain() {
			int a=82;
			int b=7;
			int rem=a%b;
			System.out.println("non-static method remainder is " + rem);
		}
		public static void main(String [] args) {
			StaticNonstaticMethods_4 a=new StaticNonstaticMethods_4();
			add();
			sub();
			mul();
			div();
			sub();
			remainder();
			a.addition();
			a.subtraction();
			a.multiplication();
			a.division();
			a.remain();	
		}
}
