package chapter4WritingClasses;

public class CircleTester {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(10.0);
		Circle c3 = new Circle(13.42);
		Circle c4 = new Circle(10.0);

		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
		System.out.print("c4: " + c4);
		System.out.println("\n");
		System.out.println("c1.equals(c2): " + c1.equals(c2));
		System.out.println("c2.equals(c4): " + c2.equals(c4));
		System.out.println("c2 == c4: " + (c2 == c4));
	}

}
