package chapter3ProgramStatements;
import java.util.Scanner;

public class SwitchWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		String day = "Invalid day";
		int num;
		do {
			System.out.print("Enter a number (1-7) or 0 to Quit: ");
			num = reader.nextInt();	
			switch (num) {
			case 1:
			case 7:
				day = "Weekend!!!";
				break;
			case 2:
				day = "Monday";
				break;
			case 3:
				day = "Tuesday";
				break;
			case 4:
				day = "Wednesday";
				break;
			case 5:
				day = "Thursday";
				break;
			case 6:
				day = "Friday";
				break;
			default:
				day = "Invalid Day";
			}
			System.out.println(day);
		} while (num != 0);
		System.out.println("Goodbye...");
	}
}