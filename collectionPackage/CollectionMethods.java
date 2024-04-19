package collectionPackage;
import java.util.ArrayList;

public class CollectionMethods {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Suraj");
		a1.add("Moon");
		a1.add("water");
		a1.remove("water");
		System.out.println(a1);
		System.out.println(a1.contains("Manish"));
		System.out.println(a1.isEmpty());
		System.out.println(a1.size());
		a1.clear();
		System.out.println(a1);
		
		
		
		ArrayList a2= new ArrayList();
		a2.addAll(a1);
		a2.add("Air");
		a2.add("Rock");
		a2.removeAll(a1);
		System.out.println(a2);
		System.out.println(a1.containsAll(a1));
		
		

	}

}
