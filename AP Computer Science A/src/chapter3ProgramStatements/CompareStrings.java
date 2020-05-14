package chapter3ProgramStatements;
import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String firstString = reader.next();
		System.out.print("Enter second string: ");
		String secondString = reader.next();
		if (firstString.compareTo(secondString) < 0) {
			System.out.print("The smaller value of \"" + firstString + "\" and \"" + secondString + "\" is " + firstString + "\".");
		}
		else if (firstString.compareTo(secondString) > 0) {
			System.out.print("The smaller value of \"" + firstString + "\" and \"" + secondString + " is \"" + secondString + "\".");
		}
		else {
			System.out.print("The values ahire both \"" + firstString + "\".");
		}
	}
}