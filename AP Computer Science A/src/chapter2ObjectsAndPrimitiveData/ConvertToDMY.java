package chapter2ObjectsAndPrimitiveData;
import java.util.Scanner;

public class ConvertToDMY {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a total number of days: ");
		int days = reader.nextInt();
		System.out.println(days + " days have " + (days/365) + " years, "
		+ ((days%365)/30) + " months, and " + (((days%365)%30) + " days."));

	}

}