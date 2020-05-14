package chapter6Arrays;

import java.util.Scanner;

public class GroceryList {

	public static void groceries (String[] food) {
		Scanner reader = new Scanner(System.in);
		food = new String[10];

		System.out.print("Name a food: ");
		food[0] = reader.nextLine();
		System.out.print("Name a food: ");
		food[1] = reader.nextLine();
		System.out.print("Name a food: ");
		food[2] = reader.nextLine();
		System.out.print("Name a food: ");
		food[3] = reader.nextLine();
		System.out.print("Name a food: ");
		food[4] = reader.nextLine();
		System.out.print("Name a food: ");
		food[5] = reader.nextLine();
		System.out.print("Name a food: ");
		food[6] = reader.nextLine();
		System.out.print("Name a food: ");
		food[7] = reader.nextLine();
		System.out.print("Name a food: ");
		food[8] = reader.nextLine();
		System.out.print("Name a food: ");
		food[9] = reader.nextLine();
	}

	public static void main(String[] args) {
		String[] word = new String[10];
		groceries(word);
	}
}