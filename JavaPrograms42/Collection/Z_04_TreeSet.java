package Collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Z_04_TreeSet {

	public static void main(String[] args)
	{
		TreeSet s1=new TreeSet(); //upcasting LinkedHashSet to set    //doesn't follow indexing, no NULL, doesn't accept hetergenous, no sorting,no duplicates
		s1.add(12);
		s1.add(18);
		s1.add(6);
		s1.add(23);
		System.out.println("Indexing"+s1);  // check indexing
		s1.add(23);
		s1.add(23);
		System.out.println("duplicates"+s1); // check duplicates
		s1.add(null);
		//s1.add(null);
		//s1.add(null);
		System.out.println("NULL checking"+s1); //null checking
		s1.add("amrutha");
		s1.add('a');
		System.out.println("Hetergenous"+s1); //hetergenous checking
		/*Collections.sort(s1);
		System.out.println(s1); //sorting*/
		
		

	}

}
