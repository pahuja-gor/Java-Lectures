package chapter4WritingClasses;

import java.text.DecimalFormat;

public class Employee {

	private String name;
	private double salary;

	public Employee(String employeeName, double currentSalary) {
		name = employeeName;
		salary = currentSalary;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void setName(String n) {
		name = n;
	}
	public void setSalary(double s) {
		salary = s;
	}
	public void raiseSalary(double byPercent) {
		byPercent = (byPercent / 100);
		salary = salary * (1 + byPercent);
	}
	public String toString() {
		DecimalFormat fmt = new DecimalFormat ("$0,000.00");
		return "" + name + " " + fmt.format(salary);
	}
}
