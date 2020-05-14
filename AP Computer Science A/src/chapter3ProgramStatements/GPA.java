package chapter3ProgramStatements;
import java.util.Scanner;

public class GPA {

	/**
	 * Calculates the GPA of one grade into its 
	 * numerical equivalent
	 * @param grade the grade
	 * @return the GPA
	 */
	private static double getGPA(String grade) {
		Scanner reader = new Scanner(System.in);
		double points = 0.0;
		int classCount = 0;
		int quit = 1;

		while (quit == 1) {
			System.out.print("Enter a grade or Q to quit: ");
			grade = reader.nextLine();
			switch(grade) {
			case "A+":
				points += 4.3;
				classCount ++;
				break;
			case "A":
				points += 4.0;
				classCount ++;
				break;
			case "A-":
				points += 3.7;
				classCount ++;
				break;
			case "B+":
				points += 3.3;
				classCount ++;
				break;
			case "B":
				points += 3.0;
				classCount ++;
				break;
			case "B-":
				points += 2.7;
				classCount ++;
				break;
			case "C+":
				points += 2.3;
				classCount ++;
				break;
			case "C":
				points += 2.0;
				classCount ++;
				break;
			case "C-":
				points += 1.7;
				classCount ++;
				break;
			case "D+":
				points += 1.3;
				classCount ++;
				break;
			case "D":
				points += 1.0;
				classCount ++;
				break;
			case "D-":
				points += 0.7;
				classCount ++;
				break;
			case "F":
				points += 0.0;
				classCount ++;
				break;
			case "Q":
				System.out.println("Invalid Grade.");
				System.out.println("");
				System.out.println("Total Points: " + points);
				System.out.println("Number of Classes: " + classCount);
				System.out.println("GPA: " + (points / classCount));
				quit = -1;
				break;
			default:
				System.out.println("Invalid Grade.");
			}
		}
		return points;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade1 = null;
		double gpa = GPA.getGPA(grade1);
	}

}