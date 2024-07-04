package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterable {

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
		//System.out.println(a1);
		
		Iterator i1=a1.iterator();
		while(i1.hasNext()) //true if the iteration has more elements
		{
			System.out.println(i1.next()); //true if the iteration has more elements
		
		}
		
		System.out.println("--------------------------------------");
		System.out.println("----let's iterate in forward direction----");
		
		ListIterator i2=a1.listIterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("----let's iterate in backward direction----");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}

	}

}
