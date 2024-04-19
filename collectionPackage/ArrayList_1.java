package collectionPackage;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_1 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(987);
		a1.add(908);
		a1.add("Manish");
		a1.add(true);
		a1.add(8.67);
		a1.add('p');
		a1.add(null);	
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		a2.add(987);
		a2.add(811);
		a2.add(123);
		a2.add(1);
		a2.add(90);
		a2.add(-987);
		Collections.sort(a2);
		System.out.println(a2);
		Collections.sort(a2, Collections.reverseOrder());  //sorting in reverse order
		System.out.println(a2);
		
	}

}
