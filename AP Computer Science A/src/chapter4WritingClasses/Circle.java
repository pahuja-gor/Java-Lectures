package chapter4WritingClasses;

import java.text.DecimalFormat;

public class Circle {

	private double diameter;
	//	private double area;
	//	private double circumference;

	public Circle() {
		diameter = 1;
	}
	public Circle(double diameter) {
		this.diameter = diameter;
	}
	public double getArea() {
		double area = Math.PI * (diameter / 2) * (diameter / 2);
		return area;
	}
	public double getCircumference() {
		double circumference = Math.PI * diameter;
		return circumference;
	}
	public double getDiameter() {
		return diameter;
	}
	public boolean equals(Object obj) {
		Circle temp = (Circle) obj;

		return (diameter == temp.getDiameter());
	}
	public String toString()
	{
		DecimalFormat fmt = new DecimalFormat ("0.00");
		return "diameter: " + diameter + "		"
		+ "area: " + fmt.format(Circle.this.getArea()) + "		"
		+ "circumference: " + fmt.format(Circle.this.getCircumference());
	}
}
