package Collection;

import java.util.ArrayList;

public class Collection_Program2 {

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
		System.out.println("Before Removal ->"+a1);
		a1.remove("Amrutha");
		System.out.println("After Removal ->"+a1);
		
		ArrayList a2=new ArrayList();
		a2.addAll(a1);
		a2.add("Surya");
		a2.removeAll(a1);
		System.out.println(a2);
		
		System.out.println(a2.size());
		
		ArrayList a3=new ArrayList();
		a3.add("1");
		a3.add("1354");
		a3.add("13432");
		a3.add("17979");
		a3.add("12142");
		System.out.println("Before clearing "+a3);
		a3.clear();
		System.out.println("After clearing "+a3);	
		
	}

}
