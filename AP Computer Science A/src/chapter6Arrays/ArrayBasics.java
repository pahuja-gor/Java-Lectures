package chapter6Arrays;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayBasics {

	public static void main(String[] args) {
		int[] numbers = new int[5];

		for (int x = 0; x < numbers.length	; x ++) {
			numbers[x] = ThreadLocalRandom.current().nextInt(1, 11)/*(int)(Math.random() * 10)*/;
		}
		for (int x = 0; x < numbers.length; x ++) {
			System.out.print(numbers[x] + " ");
		}

		int sum = 0;

		for (int x = 0; x < numbers.length; x ++) {
			sum += numbers[x];
		}
		System.out.println("\nThe sum is " + sum);
		System.out.println("The second element is " + numbers[1]);
		int smallNum = 0;
		if (numbers[1] > numbers[0]) {
			smallNum = numbers[0];
		}
		else if (numbers[0] > numbers[1]) {
			smallNum = numbers[1];
		}
		else if (numbers[0] == numbers[1]) {
			smallNum = numbers[0];
		}
		if (numbers[2] > smallNum) {
			smallNum = smallNum;
		}
		else if (smallNum > numbers[2]) {
			smallNum = numbers[2];
		}
		else if (smallNum == numbers[2]) {
			smallNum = smallNum;
		}
		if (numbers[3] > smallNum) {
			smallNum = smallNum;
		}
		else if (smallNum > numbers[3]) {
			smallNum = numbers[3];
		}
		else if (smallNum == numbers[3]) {
			smallNum = smallNum;
		}
		if (numbers[4] > smallNum) {
			smallNum = smallNum;
		}
		else if (smallNum > numbers[4]) {
			smallNum = numbers[4];
		}
		else if (smallNum == numbers[4]) {
			smallNum = smallNum;
		}
		System.out.println("The smallest value in the array is " + smallNum);
	}
}