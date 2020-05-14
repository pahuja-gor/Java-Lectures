package chapter4WritingClasses;

import java.util.Scanner;

public class RockPaperScissorsModified {

	static String playerName;
	public static void main(String[] args) {

		boolean keepPlaying = true;
		Scanner reader = new Scanner(System.in);

		System.out.println("Welcome to Rock, Paper, Scissors");
		System.out.print("What is your name? ");

		playerName = reader.nextLine();

		System.out.println("Welcome " + playerName + "!");

		while(keepPlaying) {
			int playerScore = 0;
			int cpuScore = 0;

			while ((playerScore != 3) && (cpuScore != 3)) {
				//Creates the "Menu" for the Game, which allows the User to choose his weapon
				System.out.print("What weapon would you like to choose (1. Rock, 2. Paper, or 3. Scissors)? ");
				int choice = reader.nextInt();
				int cpuChoice = (int) (1 + Math.random() * 3);

				DisplayUserChoice(choice);
				DisplayCpuChoice(cpuChoice);

				switch (choice) {
				case 1:
				{			
					if (cpuChoice == 1) {
						DisplayDrawResult();
					}
					else if (cpuChoice == 2) {
						DisplayCpuWon();
						cpuScore++;
					}
					else if (cpuChoice == 3) {
						DisplayUserWon();
						playerScore++;					
					}

					DisplayScore(playerScore, cpuScore);
					break;
				}
				case 2:
				{
					if (cpuChoice == 1) {
						DisplayUserWon();
						playerScore++;

					}
					else if (cpuChoice == 2) {
						DisplayDrawResult();

					}
					else if (cpuChoice == 3) {

						DisplayCpuWon();
						cpuScore++;

					}

					DisplayScore(playerScore, cpuScore);
					break;
				}
				case 3:
				{
					if (cpuChoice == 1) {
						DisplayCpuWon();
						cpuScore++;
					}
					else if (cpuChoice == 2) {
						DisplayUserWon();
						playerScore++;

					}
					else if (cpuChoice == 3) {
						DisplayDrawResult();
					}

					DisplayScore(playerScore, cpuScore);

					break;
				}
				default:
					System.out.println("Invalid Option. Please provide a valid option. ");
					break;
				}
			}

			//Game Over scene of the game
			if ((cpuScore == 3)) {
				System.out.println("GAME OVER!!! The CPU Won!!!");
			}
			else if ((playerScore == 3)) {
				System.out.println("GAME OVER!!! " + playerName + " Won!!!");
			}

			//Sets up the function of the game where the user can decide whether he/she wants to play again or not
			String yesOrNo;
			boolean invalid;
			do {
				invalid = true;

				System.out.print("Do you wish to play again - Y or N? ");
				yesOrNo = reader.next().toLowerCase();

				if (yesOrNo.equals("y")) {
					keepPlaying = true;
					System.out.print("Keep playing!\n");
					invalid = false;
				}
				else if (yesOrNo.equals("n")) {
					keepPlaying = false;
					System.out.print("Goodbye!!!");
					invalid = false;
				}
			} while(invalid);
		}
	}

	public static void DisplayCpuChoice(int choice) {

		String message = "The Computer chose " + Weapon(choice);

		System.out.println(message);
	}

	public static void DisplayUserChoice(int choice) {

		String message = "You chose " + Weapon(choice) + ", ";

		System.out.println(message);
	}

	public static void DisplayScore(int playerScore, int cpuScore) {

		System.out.println("The score is now: " + playerName + ": " + playerScore + "	" + "CPU: " + cpuScore);
	}

	public static String Weapon(int choice) {

		if (choice == 1) {
			return "Rock";
		} else if (choice == 2) {
			return "Paper";
		} else if (choice == 3) {
			return "Scissors";
		}

		return "Invalid Weapon";
	}

	public static void DisplayDrawResult() {

		System.out.print("It's a draw.");
	}

	public static void DisplayUserWon() {

		System.out.println("You Won.");
	}

	public static void DisplayCpuWon() {

		System.out.println("The CPU Won.");
	}
}