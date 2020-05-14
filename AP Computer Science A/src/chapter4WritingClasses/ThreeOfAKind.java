package chapter4WritingClasses;
public class ThreeOfAKind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die d1 = new Die();
		Die d2 = new Die(5);
		Die d3 = new Die(4);
		int rollTime = 5000;
		int count = 0;

		for (int x = 1; x <= rollTime; x ++) {
			int roll1 = d1.roll();
			int roll2 = d2.roll();
			int roll3 = d3.roll();

			System.out.print(roll1 + "  ");
			System.out.print(roll2 + "  ");
			System.out.println(roll3);
			if ((roll1 == roll2) && (roll2 == roll3)) {
				count ++;
			}
		}
		System.out.println("Number of Times THREE OF A KIND Was Rolled: " + count);
	}
}
