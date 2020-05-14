package chapter6Arrays;

public class Accounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount accounts[] = new BankAccount[3];
		accounts[0] = new BankAccount("Amy", 1000);
		accounts[1] = new BankAccount("Dr. Who", 1234);
		for (int x = 0; x < accounts.length; x ++) {
			System.out.println(accounts[x]);
		}
		accounts[2] = new BankAccount("Shrek", 25.03);
//		String name = BankAccount.class.getName();
		for (BankAccount name: accounts) {
			System.out.println(name.getName());
		}
		accounts[1].deposit(350);
		accounts[2].withdraw(25);
		for (int x = 0; x < accounts.length; x ++) {
			System.out.println((x + 1) + ": " + accounts[x].toString());
		}
	}

}
