package chapter3ProgramStatements;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Wages {
	/**
	 * Ensures the number of hours worked is between 0 and 168
	 * @param input the filestream to read keyboard input
	 * @return the number of hours worked
	 */
	public static int getValidHours(Scanner input) {
		int hours = -1;
		while ((hours < 0) || (hours > 168)) {
			System.out.print("Enter the number of hours worked this week: ");
			hours = input.nextInt();
		}
		return hours;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int hours = Wages.getValidHours(reader);
		int extraHours = 0;
		if (hours > 40) {
			extraHours = hours - 40;
			hours = 40;
		}

		System.out.print("Enter your wage: ");
		Double wage = reader.nextDouble();
		DecimalFormat fmt = new DecimalFormat ("$0.##");
		Double total = wage * hours;
		if (extraHours > 0) {
			total += (wage * extraHours * 1.5);
		}
		System.out.println("You made " + fmt.format(total) + " this week.");


	}

}
