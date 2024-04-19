package stringfunctions;

public class String1 {

	public static void main(String[] args) {
		String name="Amrutha";
		int size= name.length();
		System.out.println(size);
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf('A'));
		System.out.println("Amrutha".equals("Amrutha"));
	}

}
