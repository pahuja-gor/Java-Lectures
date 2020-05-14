package chapter6Arrays;
import java.util.Scanner;

public class ExponentChart {

	private static int numbers = 10;
	public ExponentChart() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.print("Enter the size (number of columns) of the exponent chart: ");
		
		int nthPower = reader.nextInt();

		if(nthPower < 1) {
			System.out.println("Invalid size of the exponent chart provided.");
			reader.close();
			return;
		}
		
		ExponentChart m = new ExponentChart();
		
		int[][] tables = m.createMultiplicationTable(nthPower);

		//Print multiplication Table
		for(int r = 0; r < numbers; r++) {
			String row = "";
			for(int c = 0; c < nthPower; c++) {
				row += tables[r][c] + "\t";
			}
			System.out.println(row);
		}
		
		reader.close();
	}
	
	// Create a multiplication table using a 2D array  of given table size
	private int[][] createMultiplicationTable(int nthPower) {
	
		int[][] tables = new int[numbers][nthPower];

		for(int r = 0; r < numbers; r++) {
			for(int c = 0; c < nthPower; c++) {
				
				tables[r][c] = (int) Math.pow(r+1, c+1);//(r+1) << (c+1);
			}
		}
		
		return tables;
	}
}
