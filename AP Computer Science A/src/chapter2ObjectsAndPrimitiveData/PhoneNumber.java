package chapter2ObjectsAndPrimitiveData;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class PhoneNumber {

	public static void main(String[] args) {
		for (int x = 1; x <= 20; x ++) {

			//			Random rnd = new Random();
			//			int areaCode = ThreadLocalRandom.current().nextInt(2, 8);
			//			int numSet1 = ThreadLocalRandom.current().nextInt(0, 8);
			//			int numSet2 = ThreadLocalRandom.current().nextInt(0, 8);
			//			int prefix = ThreadLocalRandom.current().nextInt(200, 742);
			//			int lineNum = ThreadLocalRandom.current().nextInt(1000, 10000);

			int areaCode1 = (int) Math.floor(Math.random() * (7 - 2 + 1) + 2);
			int areaCode2 = (int) Math.floor(Math.random() * (7 - 0 + 1) + 0);
			int areaCode3 = (int) Math.floor(Math.random() * (7 - 0 + 1) + 0);
			int prefix = (int) Math.floor(Math.random() * (741 - 200 + 1) + 200);
			int lineNum = (int) Math.floor(Math.random() * (10000 - 1000 + 1) + 1000);

			System.out.println("(" + areaCode1 + areaCode2 + areaCode3 + ") " + prefix + " - " + lineNum);
		}
	}

}