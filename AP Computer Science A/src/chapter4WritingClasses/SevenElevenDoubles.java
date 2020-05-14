package chapter4WritingClasses;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class SevenElevenDoubles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die d1 = new Die();
		Die d2 = new Die();
		int rollTime = 100000;
		int countSeven = 0;
		int countEleven = 0;
		int countDouble = 0;

		DecimalFormat fmt = new DecimalFormat("0.00");

		for (int x = 1; x <= 3; x ++) {
			for (int y = 1; y <= rollTime; y ++) {
				int roll1 = d1.roll();
				int roll2 = d2.roll();

				if (roll1 == roll2) {
					countDouble ++;
				}
				else if ((roll1 + roll2) == 7) {
					countSeven ++;
				}
				else if ((roll1 + roll2) == 11) {
					countEleven ++;
				}
			}
			double countSeven2 = countSeven;
			double countEleven2 = countEleven;
			double countDouble2 = countDouble;

			double averageTotal = (100 * ((countSeven2 + countEleven2 + countDouble2) / rollTime));
			double averageSeven = (100 * ((countSeven2) / rollTime));
			double averageEleven = (100 * ((countEleven2) / rollTime));
			double averageDouble = (100 * ((countDouble2) / rollTime));
			System.out.println("The Chance of Rolling a 7, 11, or Doubles was " + (fmt.format(averageTotal) + "%"));
			System.out.println("7:  " + countSeven + "  (" + (fmt.format(averageSeven) + "%)"));
			System.out.println("11:  " + countEleven + "  (" + (fmt.format(averageEleven) + "%)"));
			System.out.println("Doubles:  " + countDouble + "  (" + (fmt.format(averageDouble) + "%)"));
			System.out.println("");
		}
	}
}