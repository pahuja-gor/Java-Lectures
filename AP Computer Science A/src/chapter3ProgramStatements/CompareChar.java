package chapter3ProgramStatements;
import java.util.Scanner;

public class CompareChar {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter first character: ");
		String firstChar = reader.next();
		System.out.print("Enter second character: ");
		String secondChar = reader.next();
		char firstC = firstChar.charAt(0);
		char secondC = secondChar.charAt(0);

		if(firstC < secondC) {
			System.out.println("The smaller value of '" + firstC + "' and '" + secondC + "' is '" + firstC + "'.");
		}
		else if(firstC > secondC) {
			System.out.println("The smaller value of '" + secondC + "' and '" + firstC + "' is '" + secondC + "'.");
		}
		else {
			System.out.println("The values are both '" + firstC + "'.");
		}
	}
}