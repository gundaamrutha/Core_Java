package Collection;

import java.util.ArrayList;

public class Collection_Program1
{

	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList(); //indexing,NULL,Duplicates
		a1.add("Manish");
		a1.add("Amrutha");
		a1.add("Monisha");
		a1.add(32);
		a1.add('a');
		a1.add(32.5);
		a1.add(true);
		a1.add(null);
		a1.add("Amrutha");
		System.out.println(a1);
		
		ArrayList a2=new ArrayList(); 
		a2.addAll(a1);   // addAll stories collection ; add stories object
		a2.add("Mom");
		a2.add(38483385);
		System.out.println(a2);

		System.out.println(a2.contains("Amrutha"));
		
		System.out.println(a2.containsAll(a1));
		
		System.out.println(a2.isEmpty());
		
		ArrayList a3=new ArrayList();
		System.out.println(a3.isEmpty());
		
		
	}

}
