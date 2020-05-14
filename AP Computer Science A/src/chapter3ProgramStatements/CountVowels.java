package chapter3ProgramStatements;
import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner (System.in);
		System.out.print("Enter a phrase: ");
		String phrase = reader.nextLine();
		phrase = phrase.toLowerCase();
		int count = phrase.length();
		String transfer = phrase;
		char firstChar;
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		int cons = 0;
		int space = 0;
		int sum;
		int other;

		for (int x = count; x > 0; x --) {
			transfer = phrase.substring(x - 1, x);
			firstChar = transfer.charAt(0);
			if (firstChar == ('a')) {
				a ++;
			}
			else if (firstChar == ('e')) {
				e ++;
			}
			else if (firstChar == ('i')) {
				i ++;
			}
			else if (firstChar == ('o')) {
				o ++;
			}
			else if (firstChar == ('u')) {
				u ++;
			}
			//			else if ((firstChar == ('b')) || ((firstChar == ('c') || (firstChar == ('d') || (firstChar == ('f') || (firstChar == ('f')
			//					|| (firstChar == ('g') || (firstChar == ('h') || (firstChar == ('j') || (firstChar == ('k') || (firstChar == ('l')
			//					|| (firstChar == ('m') || (firstChar == ('n') || (firstChar == ('p') || (firstChar == ('q') || (firstChar == ('r')
			//					|| (firstChar == ('s') || (firstChar == ('t') || (firstChar == ('v') || (firstChar == ('w') || (firstChar == ('x')
			//					|| (firstChar == ('y') || (firstChar == ('z')))))))))))))))))))))))) {
			//				cons ++;
			//			}
			else if (firstChar == (' ')) {
				space ++;
			}
			else if ((firstChar >= ('a')) && ((firstChar <= ('z')))) {
				cons ++;
			}
		}

		sum = (a + e + i + o + u + cons + space);
		other = (count - sum);

		System.out.println("The number of 'a': " + a);
		System.out.println("The number of 'e': " + e);
		System.out.println("The number of 'i': " + i);
		System.out.println("The number of 'o': " + o);
		System.out.println("The number of 'u': " + u);
		System.out.println("The number of consonants: " + cons);
		System.out.println("The number of spaces: " + space);
		System.out.println("The number of other characters: " + other);
	}
}