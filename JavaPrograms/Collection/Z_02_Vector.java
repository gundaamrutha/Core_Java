package Collection;

import java.util.Collections;
import java.util.Vector;

public class Z_02_Vector {

	public static void main(String[] args)
	{
		Vector a1=new Vector();
		a1.add("Manish");
		a1.add("Amrutha");
		a1.add("Monisha");
		a1.add(32);
		a1.add('a');
		a1.add(32.5);
		a1.add(true);
		a1.add(null);
		a1.add(null);
		a1.add(null);
		a1.add("Amrutha");
		a1.add("Amrutha");
		System.out.println(a1);
		
		Vector a2=new Vector();
		a2.add(23);
		a2.add(34);
		a2.add(1);
		a2.add(101);
		Collections.sort(a2);
		System.out.println(a2);


	}

}
