package Collection;

import java.util.Set;
import java.util.TreeSet;

public class Set_behaviour {

	public static void main(String[] args)
	{
		Set s1=new TreeSet(); //upcasting LinkedHashSet to set
		s1.add(12);
		s1.add(18);
		s1.add(6);
		s1.add(23);
		System.out.println(s1);  // check indexing
		s1.add(23);
		s1.add(23);
		System.out.println(s1); // check duplicates
		s1.add(null);
		s1.add(null);
		System.out.println(s1); //null checking
		//iterate from iterator -YES
		//iterate from Listiteratre - No

	}

}
