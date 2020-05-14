package chapter4WritingClasses;

public class BankAccountTester {

	public static void main(String[] args) {
		BankAccount account2 = new BankAccount("Charlie Brown", 1000);
		BankAccount account1 = new BankAccount();

		System.out.println("1st Account");
		account1.deposit(375);
		System.out.print(account1.toString());
		System.out.println("Balance: " + account1.getBalance());

		System.out.println("\n2nd Account");
		account2.deposit(609.22);
		account2.withdraw(200);
		System.out.print(account2);
		System.out.print("Name: " + account2.getName());
	}
}