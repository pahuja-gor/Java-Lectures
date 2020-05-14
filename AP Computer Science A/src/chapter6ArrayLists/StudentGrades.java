package chapter6ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGrades {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Double grade = 0.0;

		List <Double> grades = new ArrayList <Double>();

		while (grade != -1) {
			System.out.print("Enter a grade or -1 to quit: ");
			grade = reader.nextDouble();
			grades.add(grade);
		}
		double sum = 1.0;
		for(Double d : grades)
			sum += d;
		double average = (sum / (grades.size() - 1));
		double roundedAverage = Math.round(average * 10) / 10.0;
		System.out.print("The student's average is:  " + roundedAverage);
		int count = 0;
		for (int x = 0; x <= grades.size() - 2; x ++) {
			if (grades.get(x) > average) {
				count ++;
			}
		}
		System.out.println("");
		System.out.print("There were " + count + " grades higher than the average.");
	}
}