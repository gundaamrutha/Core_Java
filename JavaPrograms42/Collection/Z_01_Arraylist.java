package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Z_01_Arraylist {

	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add("Manish");
		a1.add("Amrutha");
		a1.add("Monisha");
		a1.add(32);
		a1.add('a');
		a1.add(32.5);
		a1.add(true);
		a1.add(null);
		a1.add(null);
		a1.add("Amrutha");
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		a2.add(23);
		a2.add(34);
		a2.add(1);
		a2.add(101);
		Collections.sort(a2);
		System.out.println(a2);
	}

}
