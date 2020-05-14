package chapter6Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrint {

	public static void main(String[] args) {
		//			-------------------------------------Part A------------------------------------------
		System.out.println("----------Part A----------");		
		double[] numbers = new double[10];
		for (int x = 0; x < numbers.length; x ++) {
			numbers[x] = (Math.random() * ((9 - 0) + 1)) + 0;
		}
		for (int x = 0; x < numbers.length; x ++) {
			System.out.println(x + ": " + numbers[x]);
		}
		//			-------------------------------------Part B------------------------------------------
		System.out.println("----------Part B----------");
		for (int x = 0; x < numbers.length; x ++) {
			System.out.println((x + 1) + ": " + numbers[x]);
		}
		//			-------------------------------------Part C------------------------------------------
		System.out.println("----------Part C----------");
		for (int x = 0; x < numbers.length; x ++) {
			System.out.println((x + 1) + ": " + numbers[x]);
		}
		System.out.println(" ");
		for (int x = numbers.length; x > 0; x --) {
			System.out.println(x + ": " + numbers[x-1]);
		}
		//		-------------------------------------Part D------------------------------------------
		System.out.println("----------Part D----------");
		Scanner reader = new Scanner(System.in);
		System.out.print("What is the size of the array? ");
		int arrayLength = reader.nextInt();
		double[] numbers1 = new double[arrayLength];

		for (int x = 0; x < numbers1.length; x ++) {
			numbers1[x] = (Math.random() * ((9 - 0) + 1)) + 0;
		}
		for (int x = 0; x < numbers1.length; x ++) {
			System.out.println((x + 1) + ": " + numbers1[x]);
		}
		System.out.println(" ");
		for (int x = numbers1.length; x > 0; x --) {
			System.out.println(x + ": " + numbers1[x-1]);
		}
	}
}