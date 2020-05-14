package chapter3ProgramStatements;
import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = reader.nextInt();
		int initialNumber = num;
		int digitCount = 0;
		int zeroCount = 0;
		int evenCount = 0;
		int oddCount = 0;

		while (num > 0) {
			int lastDigit = (num % 10);
			num = (num / 10);
			digitCount ++;

			if (lastDigit == 0) {
				zeroCount ++;
			}
			else if ((lastDigit % 2) == 0) {
				evenCount ++;
			}
			else
				oddCount ++;
		}
		System.out.println("The number: " + initialNumber + " has " + digitCount + " digit(s), "
				+ zeroCount + " zeros, "
				+ evenCount + " even number(s), and "
				+ oddCount + " odd number(s). ");
	}
}