package chapter3ProgramStatements;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String choice = "y";
		do { 
			System.out.print("What is the year? ");
			int year = reader.nextInt();

			if (year < 1582) {
				System.out.println("The year " + year + " is invalid!");
			}
			else if (((year % 4) != 0) || ((year % 100) == 0) && ((year % 400) != 0)) {
				System.out.println("The year " + year + " is not a Leap Year!");
			}
			else if (((year % 4)== 0) || ((year % 4) == 0) && ((year % 100) != 0) || (((year % 400) == 0))) {
				System.out.println("The year " + year + " is a Leap Year!");
			}
			//System.out.println("Play again (y/n)? ");
			//choice = reader.nextLine();
		} while(!choice.equalsIgnoreCase("n"));
	}
}