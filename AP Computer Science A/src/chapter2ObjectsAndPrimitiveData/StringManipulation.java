package chapter2ObjectsAndPrimitiveData;
import java.util.Scanner;

public class StringManipulation {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String word = "Stone Bridge High School";
		
		System.out.println("a) " + word);
		System.out.println("b) " + word.charAt(4));
		System.out.println("c) " + word.length());
		word = word.concat(" is my school.");
		System.out.println("d) " + word);
		String word1 = "Because I live in Loudoun County, ";
		word = word1.concat(word);
		System.out.println("e) " + word);
		System.out.println("f) " + word.length());
		System.out.println("g) " + word.substring(23, 72));
		System.out.println("h) " + word.substring(23, 32));
		System.out.println("i) The location of the word \"school\" is at " + word.indexOf("school"));
		System.out.println("j) The location of the word \"School\" is at " + word.indexOf("School"));
		System.out.println("k) " + word.replace('o', 'x'));
		System.out.println("l) " + word.toUpperCase());
		System.out.println("m) " + word.length());
	}
}