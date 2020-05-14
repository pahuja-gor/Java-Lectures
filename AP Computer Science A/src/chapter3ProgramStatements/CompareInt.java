package chapter3ProgramStatements;
import java.util.Scanner;

public class CompareInt {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int firstInt = reader.nextInt();
		System.out.print("Enter second number: ");
		int secondInt = reader.nextInt();
		if (firstInt < secondInt) {
			System.out.print("The smaller value of " + firstInt + " and " + secondInt + " is " + firstInt + ".");
		}
		else if (firstInt > secondInt) {
			System.out.print("The smaller value of " + firstInt + " and " + secondInt + " is " + secondInt + ".");
		}
		else {
			System.out.print("The values are both " + firstInt + ".");
		}
	}
}