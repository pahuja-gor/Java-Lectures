package chapter6ArrayLists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BowlingScores {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		List <Integer> scores = new ArrayList <Integer>();
		int score = 0;

		do {
			System.out.print("Enter a bowling score or (-999 to quit): ");
			score = reader.nextInt();
			scores.add(score);


		} while(score != -999);
		int lastNum = scores.indexOf(-999);
		scores.remove(lastNum);
		System.out.print("Bowling Scores: " + scores);
		int count = 0;
		while (count < scores.size()) {
			if ((scores.get(count) < 0) || (scores.get(count) > 300)) {
				scores.remove(count);
			}
			else {
				count ++;
			}
		}
		System.out.println("");
		System.out.print("Valid Bowling Scores: ");
		for (int x = 0; x <= scores.size() - 1; x ++) {
			System.out.print(scores.get(x) + " ");
		}
		double total = 0;
		for (double element : scores) {
			total += element;
		}

		double average = total / scores.size();
		DecimalFormat df = new DecimalFormat(".##");
		System.out.println("");
		System.out.println("Average Score: " + df.format(average));

	}

}
