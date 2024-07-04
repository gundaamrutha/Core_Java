package Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Z_07_HashSet {

	public static void main(String[] args) {
		HashSet s1=new HashSet();  //follow indexing, single NULL, accept hetergenous,no duplicates, no sorting
		s1.add(12);
		s1.add(18);
		s1.add(6);
		s1.add(23);
		System.out.println("Indexing"+s1);  // check indexing
		s1.add(23);
		s1.add(23);
		System.out.println("duplicates"+s1); // check duplicates
		s1.add(null);
		s1.add(null);
		s1.add(null);
		System.out.println("NULL checking"+s1); //null checking
		s1.add("amrutha");
		s1.add('a');
		System.out.println("Hetergenous"+s1); //hetergenous checking
		
	HashSet s2=new HashSet(); 
		s2.add(12);
		s2.add(18);
		s2.add(6);
		s2.add(23);
		Collections.sort(s2);
		System.out.println(s2); //sorting
	
	}

}
