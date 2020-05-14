package chapter2ObjectsAndPrimitiveData;
import java.text.DecimalFormat;
import java.util.*;

public class Sphere {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a radius: ");
		Double radius = reader.nextDouble();
		Double volume = ((4.0/3.0)*(Math.PI)*(Math.pow(radius, 3)));
		Double surfaceArea = ((4.0)*(Math.PI)*(Math.pow(radius, 2)));
		DecimalFormat fmt = new DecimalFormat ("0.####");
		System.out.println("Volume is " + fmt.format(volume) + " cubic inches");
		System.out.print("Surface Area is " + fmt.format(surfaceArea) + " square inches");
	}
}