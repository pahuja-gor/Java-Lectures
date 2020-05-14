package chapter6Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayBasicsForEach {

	public static void main(String[] args) {
		int[] number = new int[5];
		for (int x = 0; x < number.length; x ++) {
			Random random = new Random();
			number[x] = random.nextInt((10 - 0) + 1) + 0;
			System.out.print(number[x] + "  ");
		}
		System.out.println("");
		int sum = 0;
		for (int x = 0; x < number.length; x ++) {
			sum += number[x];
		}
		System.out.println("The sum of the numbers in the array is " + sum);
		int largeNum = Arrays.stream(number).max().getAsInt(); 
		System.out.println("The largest number in the array is " + largeNum);
	}
}