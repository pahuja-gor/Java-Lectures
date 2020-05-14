package chapter6ArrayLists;
import java.util.Scanner;

public class RPSLS {

	private static final int SIZE = 2;
	private static final Object[][] results = new Object[SIZE][SIZE];
	
	public static void main(String[] args) {

		String chooseWeapon;
		boolean keepPlaying = true;
		Scanner reader = new Scanner(System.in);


		System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock");
		System.out.print("What is your name? ");

		String name = reader.nextLine();

		System.out.println("Welcome " + name + "!");

		results[0][0] = name;
		results[1][0] = "Computer";
		
		while(keepPlaying) {
			int playerScore = 0;
			int cpuScore = 0;

			while ((playerScore != 3) && (cpuScore != 3)) {
				//Creates the "Menu" for the Game, which allows the User to choose his weapon
				System.out.print("What weapon would you like to choose (1. Rock, 2. Paper, 3. Scissors, 4. Lizard, or 5. Spock)? ");
				int choice = reader.nextInt();
				int cpuChoice = (int) (1 + Math.random() * 5);

				switch (choice) {
				case 1:
				{
					chooseWeapon = "You chose Rock, ";
					System.out.print(chooseWeapon);

					if (cpuChoice == 1) {
						System.out.println("The Computer chose Rock");
					} else if (cpuChoice == 2) {
						System.out.println("The Computer chose Paper");
					} else if (cpuChoice == 3) {
						System.out.println("The Computer chose Scissors");
					} else if (cpuChoice == 4) {
						System.out.println("The Computer chose Lizard");
					} else if (cpuChoice == 5)  {
						System.out.println("The Computer chose Spock");
					}
					
					//The logic behind the scoring process if the user chose rock as his/her weapon
					if (cpuChoice == 1) {
						System.out.println("It's a draw. ");
					}
					else if (cpuChoice == 2) {
						System.out.println("The CPU Won");
						cpuScore++;
					}
					else if (cpuChoice == 3) {
						System.out.println("You Won");
						playerScore++;
					}
					else if (cpuChoice == 4) {
						System.out.println("You Won");
						playerScore++;
					}
					else if (cpuChoice == 5) {
						System.out.println("The CPU Won");
						cpuScore++;
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
					} else if (cpuChoice == 3) {
						System.out.println("The Computer chose Scissors");
					} else if (cpuChoice == 4) {
						System.out.println("The Computer chose Lizard");
					} else if (cpuChoice == 5)  {
						System.out.println("The Computer chose Spock");
					}

					//					The logic behind the scoring process if the user chose paper as his/her weapon
					if (cpuChoice == 1) {
						System.out.println("You Won");
						playerScore++;
					}
					if (cpuChoice == 2) {
						System.out.print("It's a draw");
					}
					if (cpuChoice == 3) {
						System.out.println("The CPU Won");
						cpuScore++;
					}
					else if (cpuChoice == 4) {
						System.out.println("The CPU Won");
						cpuScore++;
					}
					else if (cpuChoice == 5) {
						System.out.println("You Won");
						playerScore++;
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
					} else if (cpuChoice == 3) {
						System.out.println("The Computer chose Scissors");
					} else if (cpuChoice == 4) {
						System.out.println("The Computer chose Lizard");
					} else if (cpuChoice == 5)  {
						System.out.println("The Computer chose Spock");
					}
					
					//					The logic behind the scoring process if the user chose rock as his/her weapon
					if (cpuChoice == 1) {
						System.out.println("The CPU Won");
						cpuScore++;
					}
					if (cpuChoice == 2) {
						System.out.println("You Won");
						playerScore++;
					}
					if (cpuChoice == 3) {
						System.out.print("It's a draw");
					}
					else if (cpuChoice == 4) {
						System.out.println("You Won");
						playerScore++;
					}
					else if (cpuChoice == 5) {
						System.out.println("The CPU Won");
						cpuScore++;
					}
					break;
				}
				case 4:
				{
					chooseWeapon = "You chose Lizard, ";
					System.out.print(chooseWeapon);

					if (cpuChoice == 1) {
						System.out.println("The Computer chose Rock");
					} else if (cpuChoice == 2) {
						System.out.println("The Computer chose Paper");
					} else if (cpuChoice == 3) {
						System.out.println("The Computer chose Scissors");
					} else if (cpuChoice == 4) {
						System.out.println("The Computer chose Lizard");
					} else if (cpuChoice == 5)  {
						System.out.println("The Computer chose Spock");
					}

					//					The logic behind the scoring process if the user chose rock as his/her weapon
					if (cpuChoice == 1) {
						System.out.println("The CPU Won");
						cpuScore++;
					}
					if (cpuChoice == 2) {
						System.out.println("You Won");
						playerScore++;
					}
					if (cpuChoice == 3) {
						System.out.println("The CPU Won");
						cpuScore++;
					}
					else if (cpuChoice == 4) {
						System.out.println("It's a draw");
					}
					else if (cpuChoice == 5) {
						System.out.println("You Won");
						playerScore++;
					}
					break;
				}
				case 5:
				{
					chooseWeapon = "You chose Spock, ";
					System.out.print(chooseWeapon);

					if (cpuChoice == 1) {
						System.out.println("The Computer chose Rock");
					} else if (cpuChoice == 2) {
						System.out.println("The Computer chose Paper");
					} else if (cpuChoice == 3) {
						System.out.println("The Computer chose Scissors");
					} else if (cpuChoice == 4) {
						System.out.println("The Computer chose Lizard");
					} else if (cpuChoice == 5)  {
						System.out.println("The Computer chose Spock");
					}
					
					//					The logic behind the scoring process if the user chose rock as his/her weapon
					if (cpuChoice == 1) {
						System.out.println("You Won");
						playerScore++;
					}
					if (cpuChoice == 2) {
						System.out.println("The CPU Won");
						cpuScore++;
					}
					if (cpuChoice == 3) {
						System.out.println("You Won");
						playerScore++;
					}
					else if (cpuChoice == 4) {
						System.out.println("The CPU Won");
						cpuScore++;
					}
					else if (cpuChoice == 5) {
						System.out.println("It's a draw");
					}
					break;
				}
				default:
					chooseWeapon = "Invalid Option. Please provide a valid option. ";
					System.out.println(chooseWeapon);
					break;
				}
			}
			
			results[0][1] = playerScore;
			results[1][1] = cpuScore;
			
			System.out.println("\nFinal Scores are:\n");
			writeResults();
			System.out.println();
			
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
					System.out.print("Stop Playing.");
					invalid = false;
				}
				else { 
					invalid = true;
				}
			} while(invalid);
		}
	}
	
	/**
	 * Display players Results on screen
	 */
	private static void writeResults()
	{
		System.out.println("Scores: ");
		for(int r = 0; r < SIZE; r++) {
			String row = "";
			for(int c = 0; c < SIZE; c++) {
				row += results[r][c] + " "/* + "\t"*/;
			}
			System.out.println(row);
		}
	}
}