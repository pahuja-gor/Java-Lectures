package chapter6ArrayLists;

import java.util.Arrays;

public class MagicSquare {

	private int[][] myMat;
	private final int SIZE;

	/**
	 * Creates a SIZE x SIZE matrix of integers by setting
	 * it equal to the specified matrix.
	 * @param matrix a SIZE x SIZE matrix of integers
	 * Postcondition: myMat may or may not be a magic square.
	 */
	public MagicSquare(int[][] matrix)
	{
		myMat = matrix;
		if (myMat == null) {
			SIZE = 0;
		}
		else {
			SIZE = myMat.length;
		}
	}

	/**
	 * Display matrix on screen
	 */
	public void writeMatrix()
	{
		for(int r = 0; r < SIZE; r++) {
			String row = "";
			for(int c = 0; c < SIZE; c++) {
				row += myMat[r][c] + "\t";
			}
			System.out.println(row);
		}
	}


	/**
	 * @param row a row in in the matrix
	 * Precondition: 0 <= row < SIZE
	 * @return the sum of the elements in row
	 */
	public int sumRow(int row)
	{	
		if(row < 0 || row >= SIZE) {
			return 0;
		}
		
		int sum = 0;

		for(int c = 0; c < SIZE; c++) {

			sum += myMat[row][c];
		}
		
		return sum;
	}


	/**
	 * @param col a column in the matrix
	 * Precondition: 0 <= col < SIZE
	 * @return the sum of elements in col
	 */
	public int sumCol(int col)
	{
		if(col < 0 || col >= SIZE) {
			return 0;
		}
		
		int sum = 0;

		for(int r = 0; r < SIZE; r++) {

			sum += myMat[r][col];
		}
		
		return sum;
	}

	/**
	 * @return the sum of elements in the major diagonal
	 */
	public int sumMajorDiag()
	{
		if(SIZE < 0) {
			return 0;
		}
		
		int sum = 0;

		for(int r = 0; r < SIZE; r++) {

			sum += myMat[r][r];
		}
		
		return sum;
	}

	/**
	 * @return the sum of the elements in the minor diagonal
	 */
	public int sumMinorDiag()
	{
		if(SIZE < 0) {
			return 0;
		}
		
		int sum = 0;

		for(int r = SIZE-1, c = 0; r >= 0; r--, c++) {

			sum += myMat[r][c];
		}
		
		return sum;
	}

	/**
	 * Precondition: myMat is a square matrix of integers,
	 * 				 which may or may not be a magic square.
	 * @return true if myMat is a magic square, false otherwise
	 */
	public boolean isMagic()
	{
		if(SIZE < 0) {
			return false;
		}

		int sum = sumRow(0);
		
		for(int r = 1; r < SIZE; r++) {
	
			if(sum != sumRow(r)) {
				return false;
			}
		}

		for(int c = 0; c < SIZE; c++) {

			if(sum != sumCol(c)) {
				return false;
			}
		}
		
		if(sum != sumMajorDiag()) {
			return false;
		}
		
		if(sum != sumMinorDiag()) {
			return false;
		}
		
		return true;
	}
}