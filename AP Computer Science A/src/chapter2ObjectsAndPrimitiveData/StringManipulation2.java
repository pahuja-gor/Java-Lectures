package chapter2ObjectsAndPrimitiveData;

public class StringManipulation2 {

	public static void main(String[] args) {
		String string1 = "This is a test.";
		String string2 = "For the next sixty seconds we will conduct a test of the emergency broadcast system.";
		String string3 = "This is only a test.";

		System.out.println("a) " + string2.charAt(27));
		String string4 = string1.concat(" " + string2.concat(" " + string3));
		System.out.println("b) " + string4);
		System.out.println("c) " + string2.equals(string4));
		System.out.println("d) " + string2.compareTo(string3));
		String string5 = "this is only a test.";
		System.out.println("e) " + string5);
		System.out.println("f) " + string3.equals(string5));
		System.out.println("g) " + string3.equalsIgnoreCase(string5));
		System.out.println("h) The location of the word \"he\" is at " + string1.indexOf("he"));
		System.out.println("i) The location of the word \"he\" is at " + string2.indexOf("he"));
		string2 = string2.replaceAll("he", "xyzzy");
		System.out.println("j) " + string2);
		System.out.println("k) " + string1.length());
		System.out.println("l) " + string1.substring(2, string1.length()));
		System.out.println("m) " + string2.substring(2, 11));
	}
}