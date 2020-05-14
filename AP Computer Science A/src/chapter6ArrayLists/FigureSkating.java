package chapter6ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class FigureSkating {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		List <Double> scores = new ArrayList <Double>();
		double score = 0.0;

		System.out.print("Enter a skating score (0.25 - 10.0) or 0 to quit: ");
		score = reader.nextDouble();
		do {
			if ((score < 0.25) || (score > 10.0)) {
				System.out.print("Invalid Code. Enter a skating score (0.25 - 10.0) or 0 to quit: ");
				score = reader.nextDouble();
			}
			else {
				scores.add(score);
				System.out.print("Enter a skating score (0.25 - 10.0) or 0 to quit: ");
				score = reader.nextDouble();
			}
		} while(score != 0);
		System.out.print(scores.toString());
		Double maxNum = Collections.max(scores);
		Double minNum = Collections.min(scores);
		System.out.println("");
		System.out.print("High Score: " + maxNum + "  Low Score: " + minNum);
		scores.remove(minNum);
		scores.remove(maxNum);
		System.out.println("");
		System.out.print(scores.toString());

		double total = 0;
		for (double element : scores) {
			total += element;
		}

		double average = total / scores.size();
		System.out.println("");
		System.out.println("Score Average: " + average);
	}
}