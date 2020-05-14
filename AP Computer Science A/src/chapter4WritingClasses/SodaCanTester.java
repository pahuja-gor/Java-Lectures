package chapter4WritingClasses;

public class SodaCanTester {

	public static void main(String[] args) {
		SodaCan sc1 = new SodaCan();
		SodaCan sc2 = new SodaCan(10.0, 13.2);
		SodaCan sc3 = new SodaCan(13.42, 20.1);
		SodaCan sc4 = new SodaCan(13.42, 20.1);

		System.out.println("sc1: " + sc1);
		System.out.println("sc2: " + sc2);
		System.out.println("sc3: " + sc3);
		System.out.print("sc4: " + sc4);
		System.out.println("\n");
		System.out.println("sc2.equals(sc3): " + sc2.equals(sc3));
		System.out.println("sc3.equals(sc4): " + sc3.equals(sc4));
		System.out.println("sc3 == sc4: " + (sc3 == sc4));
	}

}
