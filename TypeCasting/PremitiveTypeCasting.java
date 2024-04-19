package TypeCasting;

public class PremitiveTypeCasting {

	public static void main(String[] args)
	{
		double weight=83;
		System.out.println(weight);
		
		double weight1=(double)83;
		System.out.println(weight1); //widening
		
		int a1=(int)83.65; //narrowing
		System.out.println(a1);
		
		double a=90.87;
		int a2=(int)a;
		System.out.println(a2);

	}

}
