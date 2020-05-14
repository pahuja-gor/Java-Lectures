package chapter6ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GolfScore {

	static int totalPlayers = 4;
	static int totalHoles = 9;
	static int[][] scores = new int[totalPlayers][totalHoles];
	
	public static void main(String[] args) {
		
		createScores();
		
		printScores();
	}

	private static void createScores() {
		
		Random r = new Random();
		for (int hole = 0;  hole < totalHoles;  hole++) {
			for (int player = 0; player < totalPlayers; player++) {
				scores[player][ hole] = r.nextInt((totalHoles - 1) + 1) + 1;
			}
		}
	}
	
	private static void printScores() {
		
		String row = "\t\t";
		//Print Row 1 (Holes)
		for(int r = 0; r < totalHoles; r++) {
			row += "Hole " + (r+1) + "\t";
		}
		row += "Total";
		
		System.out.println(row);
		
		//Print Player Rows
		for(int r = 0; r < totalPlayers; r++) {
			row = "Player: " + (r+1) + "\t";
			int total = 0;
			for(int c = 0; c < totalHoles; c++) {
				total += scores[r][c];
				row += scores[r][c] + "\t";
			}
			System.out.println(row + total);
		}

		int[] mins = new int[totalHoles];
		//Winner Row
		row = "Winner: " + "\t";

		int min = 0;
		for (int hole = 0;  hole < totalHoles;  hole++) {
			min = scores[0][hole];
			for (int player = 1; player < totalPlayers; player++) {
				
				min = Math.min(min, scores[player][hole]);
			}
			
			for (int player = 0; player < totalPlayers; player++) {
				
				if(scores[player][hole] == min) {
					
					mins[hole] = min;
					
					row += (player+1) + "\t";
					
					break;
				}
			}
		}
		
		System.out.println();
		System.out.println(row);


		//Overall Winner Row
		
		int[] wins = new int[totalPlayers];
		
		for (int hole = 0;  hole < totalHoles;  hole++) {
			for (int player = 0; player < totalPlayers; player++) {
				
				if(scores[player][hole] == mins[hole]) {
					
					wins[player]++;				
				}
			}
		}

		//System.out.println(Arrays.toString(wins));

		int max = wins[0];
		for (int player = 1; player < totalPlayers; player++) {
			
			max = Math.max(max, wins[player]);
		}

		row = "Overal Winner was Player ";
		
		for (int player = 0; player < totalPlayers; player++) {
			
			if(max == wins[player]) {
				row += (player+1) + " ";
			}
		}

		System.out.println();
		System.out.println(row);
	}

}