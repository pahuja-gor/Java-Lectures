package chapter6Arrays;
import java.util.Scanner;
import java.util.Random;

public class ArraySwap {

	public ArraySwap() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the size of your character array: ");
		
		int size = reader.nextInt();

		if(size < 1) {
			System.out.println("Invalid size of array provided.");
			reader.close();
			return;
		}
		
		char[] letters = createArray(size);
		
		System.out.println(letters);
		
		System.out.println("Enter an index to swap (0 - "+(size-1)+ "): ");
		
		int initialIndex = reader.nextInt();
	
		if (initialIndex < 0 || initialIndex >= size) {
			
			System.out.println("Invalid Index to swap array provided.");
			reader.close();
			return;			
		}
		
		System.out.println("Enter another index to swap (0 - "+(size-1)+ "): ");
		
		int finalIndex = reader.nextInt();

		if (finalIndex < 0 || finalIndex >= size)
		{
			System.out.println("Invalid Index to swap array provided.");
			reader.close();
			return;			
		}

		System.out.println(" Original Array: ");
		
		String original = "";
		for(int x = 0; x < size; x++) {
			original += letters[x] + " ";
		}

		System.out.println(original);
		
		char tmp = letters[initialIndex];
		
		letters[initialIndex] = letters[finalIndex];
		 letters[finalIndex] = tmp;

		 System.out.println("Swapped Elements: ");
		 
         String swapped = "";
         for (int x = 0; x < size; x++)
         {
             swapped += letters[x] + " ";
    	 }
         
		System.out.println(swapped);
		reader.close();
	}

	public static char[] createArray(int size) {
		char[] alphabets = new char[26];

		int i = 0;
		for (char c = 'A'; c <= 'Z'; c++) {
			alphabets[i++] = c;
		}
		
		char[] letters = new char[size];
		
		for (int x = 0; x < size; x++) {
			Random random = new Random();
			int a = random.nextInt(26 - 1);
			
			letters[x] = alphabets[a];
			
			}
		
		return letters;
	}
}
