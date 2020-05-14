package chapter4WritingClasses;

import java.text.DecimalFormat;

public class BankAccount {

	private String name;
	private double balance;

	/**
	 * Constructs a BankAccount with a name of ?? and a balance of 0.
	 */
	public BankAccount() {
		name = "??";
		balance = 0;
	}

	/**
	 * Constructs a BankAccount with a name of n and balance of bal.
	 * @param n
	 * @param bal
	 */
	public BankAccount(String n, double bal) {
		name = n;
		balance = bal;
	}

	/**
	 * Deposits the amount into the bank account.
	 * @param amount
	 */
	public void deposit (double amount) {
		balance += amount;
	}

	/**
	 * Withdraws the amount out of the bank account.
	 * @param amount
	 */
	public void withdraw (double amount) {
		balance -= amount;
	}

	/**
	 * Returns the balance of the bank account.
	 * @return the balance of the bank account
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Returns the name of the bank account.
	 * @return the name of the bank account
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the string of the name and balance of the bank account.
	 */
	public String toString() {
		DecimalFormat fmt = new DecimalFormat ("$0.00");
		return "" + name + " " + fmt.format(balance) + "\n";
	}
}
