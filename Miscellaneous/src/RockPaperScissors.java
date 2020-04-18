import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {

		String chooseWeapon;
		boolean keepPlaying = true;
		Scanner reader = new Scanner(System.in);

		System.out.println("Welcome to Rock, Paper, Scissors");
		System.out.print("What is your name? ");

		String name = reader.nextLine();

		System.out.println("Welcome " + name + "!");

		while(keepPlaying) {
			int playerScore = 0;
			int cpuScore = 0;

			while ((playerScore != 2) && (cpuScore != 2)) {
				//Creates the "Menu" for the Game, which allows the User to choose his weapon
				System.out.print("What weapon would you like to choose (1. Rock, 2. Paper, or 3. Scissors)? ");
				int choice = reader.nextInt();
				int cpuChoice = (int) (1 + Math.random() * 3);

				switch (choice) {
				case 1:
				{
					chooseWeapon = "You chose Rock, ";
					System.out.print(chooseWeapon);

					if (cpuChoice == 1) {
						System.out.println("The Computer chose Rock");
					} else if (cpuChoice == 2) {
						System.out.println("The Computer chose Paper");
					} else {
						System.out.println("The Computer chose Scissors");
					}
					//The logic behind the scoring process if the user chose rock as his/her weapon
					if (cpuChoice == 1) {
						System.out.print("It's a draw. ");
						System.out.println("The score is now: " + name + ": " + playerScore + "	" + "CPU: " + cpuScore);
					}
					if (cpuChoice == 2) {
						System.out.println("The CPU Won");
						cpuScore++;
						System.out.println("The score is now: " + name + ": " + playerScore + "	" + "CPU: " + cpuScore);
					}
					if (cpuChoice == 3) {
						System.out.println("You Won");
						playerScore++;
						System.out.println("The score is now: " + name + ": " + playerScore + "	" + "CPU: " + cpuScore);
					}
					break;
				}
				case 2:
				{
					chooseWeapon = "You chose Paper, ";
					System.out.print(chooseWeapon);

					if (cpuChoice == 1) {
						System.out.println("The Computer chose Rock");
					} else if (cpuChoice == 2) {
						System.out.println("The Computer chose Paper");
					} else {
						System.out.println("The Computer chose Scissors");
					}
					//					The logic behind the scoring process if the user chose paper as his/her weapon
					if (cpuChoice == 1) {
						System.out.println("You Won");
						playerScore++;
						System.out.println("The score is now: " + name + ": " + playerScore + "	" + "CPU: " + cpuScore);
					}
					if (cpuChoice == 2) {
						System.out.print("It's a draw");
						System.out.println("The score is now: " + name + ": " + playerScore + "	" + "CPU: " + cpuScore);
					}
					if (cpuChoice == 3) {
						System.out.println("The CPU Won");
						cpuScore++;
						System.out.println("The score is now: " + name + ": " + playerScore + "	" + "CPU: " + cpuScore);
					}

					break;
				}
				case 3:
				{
					chooseWeapon = "You chose Scissors, ";
					System.out.print(chooseWeapon);

					if (cpuChoice == 1) {
						System.out.println("The Computer chose Rock");
					} else if (cpuChoice == 2) {
						System.out.println("The Computer chose Paper");
					} else {
						System.out.println("The Computer chose Scissors");
					}
					//					The logic behind the scoring process if the user chose rock as his/her weapon
					if (cpuChoice == 1) {
						System.out.println("The CPU Won");
						cpuScore++;
						System.out.println("The score is now: " + name + ": " + playerScore + "	" + "CPU: " + cpuScore);
					}
					if (cpuChoice == 2) {
						System.out.println("You Won");
						playerScore++;
						System.out.println("The score is now: " + name + ": " + playerScore + "	" + "CPU: " + cpuScore);
					}
					if (cpuChoice == 3) {
						System.out.print("It's a draw");
						System.out.println("The score is now: " + name + ": " + playerScore + "	" + "CPU: " + cpuScore);
					}

					break;
				}
				default:
					chooseWeapon = "Invalid Option. Please provide a valid option. ";
					System.out.println(chooseWeapon);
					break;
				}
			}
			//Game Over scene of the game
			String yesOrNo;
			if ((cpuScore == 3)) {
				System.out.println("GAME OVER!!! The CPU Won!!!");
			}
			else if ((playerScore == 3)) {
				System.out.println("GAME OVER!!! " + name + " Won!!!");
			}
			//Sets up the function of the game where the user can decide whether he/she wants to play again or not
			boolean invalid;
			do {
				System.out.print("Do you wish to play again - Y or N? ");
				yesOrNo = reader.next();

				if (yesOrNo.toLowerCase().equals("y")) {
					keepPlaying = true;
					System.out.print("Keep playing!\n");
					invalid = false;
				}
				else if (yesOrNo.toLowerCase().equals("n")) {
					keepPlaying = false;
					System.out.print("Stop Playing");
					invalid = false;
				}
				else { 
					invalid = true;
				}
			} while(invalid);
		}
	}
}