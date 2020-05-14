package chapter4WritingClasses;

import java.text.DecimalFormat;

public class SodaCan {

	private double height;
	private Circle circle;

	public SodaCan() {
		height = 1;
		circle = new Circle();
	}
	public SodaCan(double height, double diameter) {
		this.height = height;
		circle = new Circle(diameter);
	}
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		double volume = circle.getArea() * height;
		return volume;
	}
	public double getSurfaceArea() {
		double surfaceArea = (2 * circle.getArea()) + (circle.getCircumference() * height);
		return surfaceArea;
	}
	public boolean equals(Object obj) {
		SodaCan temp = (SodaCan) obj;
		return (height == temp.getHeight()) && (SodaCan.this.circle.getCircumference() == temp.circle.getCircumference());
	}
	public String toString()
	{
		DecimalFormat fmt = new DecimalFormat ("0.00");
		return "diameter: " + fmt.format(SodaCan.this.circle.getDiameter()) + "		"
		+ "height: " + fmt.format(SodaCan.this.getHeight()) + "		"
		+ "volume: " + fmt.format(SodaCan.this.getVolume()) + "		"
		+ "surface area: " + fmt.format(SodaCan.this.getSurfaceArea());
	}
}