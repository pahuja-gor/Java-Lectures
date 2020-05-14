package chapter6ArrayLists;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class FigureSkatingFile {

	public static void main(String[] args) throws Exception {

		// get file
		// read file
		// print scores
		// find the highest and lowest score
		// print the highest and lowest score
		// remove the highest and lowest scores
		// find the average
		// print the average
		
		String fileName = getFileName();
		List<Double> skatingScores = getScoresFromFile(fileName);
		printScores(skatingScores);
		skatingScores = findAndRemoveScores(skatingScores);
		printScores(skatingScores);
		double average = findAverageScore(skatingScores);
		printAverageScores(average);
		

	}

	
	
	/**
	 * Prompts and returns the file name to be used.
	 * @return the name of the file in the form "filename.txt"
	 */
	public static String getFileName() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the file name without the extension (.txt): ");
		String filename = reader.nextLine();
		reader.close();
		return (filename + ".txt");
	}
	
	
	
	
	/**
	 * Reads the scores from a file and stores them into an ArrayList
	 * @param fileName the name of the file to be read
	 * @return the list of scores
	 * @throws FileNotFoundException
	 */
	private static List<Double> getScoresFromFile(String fileName) throws FileNotFoundException {
List<Double> scores = new ArrayList<Double>();
		
		File file = new File(fileName);
		Scanner fileInput = new Scanner(file);
		
		while (fileInput.hasNextLine()) {
			double score = fileInput.nextDouble();
			scores.add(score);
		}
		fileInput.close();
		
		return scores;
	}
	
	
	
	
	/**
	 * Prints the skating scores.
	 * @param skatingScores the list of skating scores
	 */
	private static void printScores(List<Double> skatingScores) {
		System.out.println(skatingScores);
	}

	
	/**
	 * Finds and removes the highest and lowest scores in the list.  If there are 
	 * duplicate high and/or low scores, only one is removed.  The highest and lowest
	 * score will be printed out.  
	 * @param skatingScores the list of skating scores
	 * @return the list of skating scores with the highest and lowest score removed.
	 */
	private static List<Double> findAndRemoveScores(List<Double> skatingScores) {
		Double maxNum = Collections.max(skatingScores);
		Double minNum = Collections.min(skatingScores);
		System.out.println("");
		System.out.print("High Score: " + maxNum + "  Low Score: " + minNum);
		skatingScores.remove(minNum);
		skatingScores.remove(maxNum);
		System.out.println("");
		return skatingScores;
	}


		

	/**
	 * Find the average of the skating scores in the list.
	 * @param skatingScores the list of skating scores
	 * @return the average of the skating scores
	 */
	private static double findAverageScore(List<Double> skatingScores) {
		double total = 0;
		for (double element : skatingScores) {
			total += element;
		}

		return (total / skatingScores.size());
	}




	
	/**
	 * Prints the average of the skating scores.
	 * @param average the average of the skating scores
	 */
	private static void printAverageScores(double average) {
		System.out.println("");
		System.out.println("Score Average: " + average);
	}





	
	
	
	

	
	

}