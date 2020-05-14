package chapter6Arrays;

import java.util.Scanner;

public class MultiplicationTable {
	

	public MultiplicationTable() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.print("Enter the size of the multiplication table: ");
		
		int tableSize = reader.nextInt();

		if(tableSize < 1) {
			System.out.println("Invalid size of the multiplication table provided.");
			reader.close();
			return;
		}
		
		MultiplicationTable m = new MultiplicationTable();
		
		int[][] tables = m.createMultiplicationTable(tableSize);

		//Print multiplication Table
		for(int r = 0; r < tableSize; r++) {
			String row = "";
			for(int c = 0; c < tableSize; c++) {
				row += tables[r][c] + "\t";
			}
			System.out.println(row);
		}
		
		reader.close();
	}
	
	// Create a multiplication table using a 2D array  of given table size
	private int[][] createMultiplicationTable(int tableSize) {
	
		int[][] tables = new int[tableSize][tableSize];

		for(int r = 0; r < tableSize; r++) {
			for(int c = 0; c < tableSize; c++) {
				
				tables[r][c] = (r+1)*(c+1);
			}
		}
		
		return tables;
	}
}
