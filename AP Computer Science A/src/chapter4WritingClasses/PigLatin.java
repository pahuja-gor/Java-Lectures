package chapter4WritingClasses;
import java.util.Scanner;

public class PigLatin {
	private static String endingPunct;
	private static String startPunct;
	private static String word;			// The original word
	private static String pigWord;		// The word translated into pig latin
	private static String reverseWord;		// The word translated into pig latin
	private static Scanner input;	
	private static String userInput;
	private static boolean isValid; 	// Determines if the set of characters can be a valid word to translate


	/**
	 * Program Main Entry Point
	 */
	public static void main (String[] args) {
		input = new Scanner(System.in);

		prompt();

		while (!word.equalsIgnoreCase("q")) {
			process();
			output();
			System.out.println();
			outputReversed();
			System.out.println();
			prompt();
		}

		System.out.println("You have successfully terminated PigLatin.java");
	}


	/**
	 * Prompt the use a word in turn into Pig Latin
	 */
	public static void prompt() {
		System.out.print("Enter a word to translate into Pig Latin or \"q\" to quit: ");

		userInput = input.next();
		word = userInput;

		startPunct = "";
		endingPunct = "";

		while(beginningPunct(word)) {
			startPunct += word.charAt(0);
			word = word.substring(1);
		}

		while(endPunct(word)) {
			int index = word.length()-1;
			endingPunct = word.charAt(index) + endingPunct;
			word = word.substring(0, index);
		}
	}



	/**
	 * Checks the word and determines if it contains a vowel
	 */	
	public static void process() {
		int index = 0;   		// The index begins at the first character in the word		
		isValid = true;  	// Assumes the word will have a vowel unless none is found

		if (isVowel(word.charAt(index))) {

			pigWord = word+"way";
			return;
		}

		pigWord = "INVALID";

		int size = word.length();
		String transfer = "";

		while (index < size - 0) {

			char firstChar = word.charAt(index);

			if (isVowel(firstChar) || (firstChar == 'y' && index > 0)) {

				if (quWord(word)) {

					pigWord = word.substring(index+1) + transfer + "uay";
				}
				else {
					pigWord = word.substring(index) + transfer + "ay";
				}

				index = size;
			}
			else {

				transfer += word.charAt(index);
				index++;
			}
		}

		if (isCapital(word)) {

			pigWord = Character.toUpperCase(pigWord.charAt(0)) + pigWord.substring(1).toLowerCase();
		}
	}


	/**
	 * Print out the original word and the new word in Pig Latin
	 */
	public static void output() {

		// Print the word in Pig Latin

		if (isValid) {
			System.out.println();
			System.out.print(userInput + "  --->  " + startPunct + pigWord + endingPunct);
			//			System.out.println();
		}
	}

	/**
	 * Reverse the output of the word.
	 * Example:  At-whay? becomes Yahw-ta?
	 */
	public static void outputReversed()	{		
		reverseWord = "";

		for (int size = pigWord.length(); size > 0 ;) {
			reverseWord += pigWord.charAt(--size);
		}

		if (isCapital(pigWord)) {

			int size = reverseWord.length();
			reverseWord = Character.toUpperCase(reverseWord.charAt(0)) + reverseWord.substring(1, size-1) + Character.toLowerCase(reverseWord.charAt(size-1));
		}

		System.out.println(startPunct + pigWord + endingPunct + " REVERSED --->  " + startPunct + reverseWord + endingPunct);
	}


	/**
	 * Determines if the character is a vowel.
	 * @param letter the letter
	 * @return true if letter is a vowel
	 */
	public static boolean isVowel(char letter) {

		letter = Character.toLowerCase(letter);

		if ((letter == 'a' || (letter == 'e') || (letter == 'i') || (letter == 'o') || (letter == 'u'))) {

			return true;
		}

		return false;
	}


	/**
	 * Determine if the word begins with a 'qu'
	 * @param str the word
	 * @return true if the word begins with a 'qu'
	 */
	public static boolean quWord(String str) {

		//return str.substring(0, 2).toLowerCase().equals("qu");
		return str.indexOf("qu") >= 0;
	}



	/**
	 * Determine if the first letter is capitalized
	 * @param str the word
	 * @return true if the first letter is capitalized
	 */
	public static boolean isCapital(String str) {


		char letter = str.charAt(0);

		if (letter >= 'A' && letter <= 'Z') return true;

		return false;
	}


	/**
	 * Determine if there is punctuation at the beginning of the word
	 * @param str the word
	 * @return true if there is punctuation at the beginning of the word
	 */
	public static boolean beginningPunct(String str) {

		return isPunct(str.charAt(0));
	}


	/**
	 * Determine if there is punctuation at the end of the word
	 * @param str the word
	 * @return true if there is punctuation at the end of the word
	 */
	public static boolean endPunct(String str) {

		return isPunct(str.charAt(str.length()-1));
	}

	/**
	 * Determine if char is punctuation
	 * @param letter the character
	 * @return true if it is punctuation
	 */
	public static boolean isPunct(char letter) {

		letter = Character.toLowerCase(letter);

		if ((letter >= 'a' && letter <= 'z') || (letter >= '0' && letter <= '9')) return false;

		return true;
	}
}