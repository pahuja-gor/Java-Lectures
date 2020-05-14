package chapter3ProgramStatements;
public class Asterisks {

	public static void main(String[] args) {
		partA();	
		partB();
		partC();
		partD();
		partE();
	}

	/**
	 * Print the asterisks pattern in Part A
	 */
	private static void partA() {
		System.out.println("Part A\n");
		for (int x = 0; x < 10; x ++) {
			for (int y = 0; y <= x; y ++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	/**
	 * Print the asterisks pattern in Part B
	 */
	private static void partB() {
		System.out.println("\nPart B\n");
		for (int x = 10; x > 0; x --) {
			for (int y = x; y > 0; y --) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	/**
	 * Print the asterisks pattern in Part C
	 */
	private static void partC() {
		System.out.println("\nPart C\n");
		for (int x = 10, a = 1; x > 0; x --, a ++) {
			for (int y = x; y > 0; y --) {
				System.out.print(" ");
			}
			for (int z = 0; z < a; z ++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	/**
	 * Print the asterisks pattern in Part D
	 */
	private static void partD() {
		System.out.println("\nPart D\n");
		for (int x = 10, a = 1; x > 0; x --, a ++) {
			for (int z = 0; z < a; z ++) {
				System.out.print(" ");
			}
			for (int y = x; y > 0; y --) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	/**
	 * Print the asterisks pattern in Part E
	 */
	private static void partE() {
		System.out.println("Part E\n");
		int i = 0;
		int max = 12;
		for (int n = 0; i <= max/2; i++, n++) {
			for (int s = max/2; s > n; s--) {
				System.out.print(" ");
			}
			for (int s = 0; s < n; s++) {
				System.out.print("*");
			}
			System.out.print("*");
			for (int s = 0; s < n; s++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		i = max;
		for (int n = 0; i >= 1; i--, n++) {
			for (int s = 0; s <= n; s++) {
				System.out.print(" ");
			}
			for (int s = 1; s < i-n; s++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}