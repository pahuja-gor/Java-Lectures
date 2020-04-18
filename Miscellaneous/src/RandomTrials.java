import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class RandomTrials {

	public static void Trial() {
		Random rand = new Random();
		//		int twoDigitRandom = rand.nextInt(99) + 1;
		int threeDigitRandom = rand.nextInt(999) + 1;
		System.out.println("The Target Random Number is: " + /*twoDigitRandom*/threeDigitRandom);
		//		int firstRandomDigit = twoDigitRandom / 10;
		//		int secondRandomDigit = twoDigitRandom % 10;
		int firstRandomDigit = threeDigitRandom / 100;
		int secondRandomDigit = (threeDigitRandom % 100) / 10;
		int thirdRandomDigit = threeDigitRandom % 10;

		int firstGuessDigit = rand.nextInt(9) + 0;
		int secondGuessDigit = rand.nextInt(9) + 0;
		int thirdGuessDigit = rand.nextInt(9) + 0;
		int trials = 0;

		while ((firstGuessDigit != firstRandomDigit) && (secondGuessDigit != secondRandomDigit) && (thirdGuessDigit != thirdRandomDigit)) {
			firstGuessDigit = rand.nextInt(9) + 1;
			secondGuessDigit = rand.nextInt(9) + 1;
			thirdGuessDigit = rand.nextInt(9) + 1;
			trials ++;
			System.out.println("Trial #" + trials + ": " + firstGuessDigit + "-" + secondGuessDigit + "-" + thirdGuessDigit);
		}
		//		System.out.println("Trial #" + (trials + 1) + ": " + firstGuessDigit + "-" + secondGuessDigit);
		System.out.println("The Final Number is: " + /*twoDigitRandom*/threeDigitRandom);
		System.out.println("The Process Took " + (trials + 1) + " Trial(s)");	
	}

	public static void main(String[] args) {
		Trial();
		Scanner reader = new Scanner(System.in);
		System.out.print("Would you like to perform another trial? ");
		String stopLine = reader.nextLine();
		while (stopLine.equals("yes")) {
			//		if (iterationLine.equals("yes")) {
			Trial();
			System.out.print("Would you like to perform another trial? ");
			stopLine = reader.nextLine();
		}
		//		else if (iterationLine.equals("no")) {
		System.exit(0);
		//		}
	}
}