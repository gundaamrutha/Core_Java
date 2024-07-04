package Collection;

import java.util.ArrayList;
import java.util.List;

public class List_behaviour {

	public static void main(String[] args)
	{
		
		List l1=new ArrayList(); //upcasting arraylist to list
		l1.add(90);
		l1.add(45);
		l1.add(60);
		l1.add(75);
		System.out.println(l1); //checking indexing
		l1.add(75); 
		l1.add(75); 
		System.out.println(l1); // checking duplicates
		l1.add(null);
		l1.add(null);
		System.out.println(l1); //NULL checking
		//iterate from iterator -YES
		//iterate from Listiteratre - YES

	}

}
