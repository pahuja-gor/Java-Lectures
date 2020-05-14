package chapter4WritingClasses;

public class EmployeeTester {

	public static void main(String[] args) {
		Employee person = new Employee("Backstorm, Divya", 70000);
		System.out.println(person);
		person.raiseSalary(10);
		System.out.println(person);
		
		person.setName("Michael");
		person.setSalary(35000);
		System.out.println(person);
		person.raiseSalary(12.34567);
		System.out.println(person.getName());
		System.out.println(person.getSalary());
		System.out.println(person);

	}

}
