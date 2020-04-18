import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {

	public static void Calculation () {
		Scanner reader = new Scanner(System.in);
		System.out.print("What operation would you like to perform? Addition, Subtraction, Multiplication, or Division? ");
		String operation = reader.nextLine();

		DecimalFormat df = new DecimalFormat("###.###");

		if (operation.toLowerCase().equals("add")) {
			System.out.println("What two numbers would you like to add together? ");
			System.out.print("\tFirst Number: ");
			double num1 = reader.nextDouble();
			System.out.print("\tSecond Number: ");
			double num2 = reader.nextDouble();
			System.out.println("The sum of the 1st Number and 2nd Number is " + df.format((num1 + num2)));
		}
		else if (operation.toLowerCase().equals("subtract")) {
			System.out.println("What two numbers would you like to subtract from each other? ");
			System.out.print("\tFirst Number: ");
			double num1 = reader.nextDouble();
			System.out.print("\tSecond Number: ");
			double num2 = reader.nextDouble();
			System.out.println("The difference between the 1st Number and the 2nd Number is " + df.format((num1 - num2)));
			System.out.println("The difference between the 2nd Number and the 1st Number is " + df.format((num2 - num1)));
		}
		else if (operation.toLowerCase().equals("multiply")) {
			System.out.println("What two numbers would you like to multiply together? ");
			System.out.print("\tFirst Number: ");
			double num1 = reader.nextDouble();
			System.out.print("\tSecond Number: ");
			double num2 = reader.nextDouble();
			System.out.println("The product of the 1st Number and the 2nd Number is " + df.format((num1 * num2)));
		}
		else if (operation.toLowerCase().equals("divide")) {
			System.out.println("What two numbers would you like to divide by each other? ");
			System.out.print("\tFirst Number: ");
			double num1 = reader.nextDouble();
			System.out.print("\tSecond Number: ");
			double num2 = reader.nextDouble();
			System.out.println("The quotient of the 1st Number and the 2nd Number is " + df.format((num1 / num2)));
			System.out.println("The quotient of the 2nd Number and the 1st Number is " + df.format((num2 / num1)));
//			System.out.println(num2/99);
//			System.out.print(num1/99);
//			System.out.println((num1 * num2)/99);
//			System.out.println(num1*num2);
//			System.out.println(num1/num2/num2/num1/num1/num1/num1/num1/num1/num1/num1/num1/num1/num1);
//			System.out.println(num2/num1/num2/num2/num2/num2/num2/num2/num2);
//			System.out.println(num2/num1/num2/num2);
			
			
		}
	}
	
	public static void main(String[] args) {
		Calculation();
		Scanner reader = new Scanner(System.in);
		System.out.print("Would you like to perform an operation? ");
		String iterationLine = reader.nextLine();
		while (iterationLine.equals("yes")) {
			//		if (iterationLine.equals("yes")) {
			Calculation();
			System.out.print("Would you like to perform an operation? ");
			iterationLine = reader.nextLine();
		}
		//		else if (iterationLine.equals("no")) {
		System.exit(0);
		//		}
	}
}