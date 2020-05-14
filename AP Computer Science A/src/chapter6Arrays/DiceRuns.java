package chapter6Arrays;

public class DiceRuns {

	private static Die die = new Die();
	private static int[] tossess;
	private static int totalToss = 20;
	private static int totalSimulation = 10;

	public DiceRuns() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Total Tosses " + totalToss);
		
		//Create a loop to run this simulation 10 times
		for(int s = 1; s <= totalSimulation; s++) {
			
			System.out.println("Simulation " + s);
			createRuns();
		}
	}
	
	private static void createRuns() {
		
		tossess = new int[totalToss];

		String result = "";
		boolean inRun = false;

		//Create Tossess for Runs
		for(int r = 0; r < totalToss; r++) {
			tossess[r] = die.roll();		
		}
		
		//Check for sequence and group
		for(int r = 0; r < totalToss; r++) {
			if( (r!= totalToss-1) && tossess[r] == tossess[r+1]) {

				if(inRun) {
					result += tossess[r] + " ";
				}
				else {
					result +=  "(" + tossess[r] + " ";
				}
				inRun = true;
			}			
			else {
	
				if(inRun) {
					result +=  tossess[r] + ") ";
				}
				else {
					result += tossess[r] + " ";
				}
				inRun = false;
			}
		}
		 
		System.out.println(result);
	}

}
