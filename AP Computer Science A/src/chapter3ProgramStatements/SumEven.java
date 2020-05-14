package chapter3ProgramStatements;
import java.util.Scanner;

public class SumEven {

	/**
	 * Ensures that the user enters a number greater than two.
	 * @return a number greater than two.
	 */
	public static int getValidNumber(Scanner input) {
		int initialNum;

		do {
			System.out.print("Enter a number greater than 2: ");
			initialNum = input.nextInt();
		} while(initialNum < 2);
		return initialNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int inputNum = SumEven.getValidNumber(reader);
		int result = 0;
		
		for (int count = 1; count <= (inputNum / 2); count ++) {
			result += (2 * count);
		}
		System.out.println("The sum of even numbers through " + inputNum + " is " + result);
	}
}