package Java_PreedyK;

import java.util.Scanner;

	class BankAccount {
		int acc_number; 
		String acc_name;
		float balance;

		BankAccount(int acc_number, String acc_name, float balance) {
			this.acc_number = acc_number;
			this.acc_name = acc_name;
			this.balance = balance;
		}

		public void displayAccountDetails() { 
			System.out.println("Account Number: " + this.acc_number);
			System.out.println("Account Holder: " + this.acc_name);
			System.out.println("Initial Balance: " + this.balance);

		}

		public void deposit(float depamt) { 
			this.balance = (balance + depamt);
			System.out.println("Deposited: " + depamt);

		}

		public void withdraw(float debamt) {
			if(debamt <= balance) {
				this.balance = (balance - debamt);
				System.out.println("Withdrawn: " + debamt);
				}
				else {
					System.out.println("Insufficient balance.");
				}
		}
}

public class Lab2 {
	public static void main (String[]args) { 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the a/c number: ");
		int acc_number = input.nextInt();
		input.nextLine();
		System.out.println("Enter the name: ");
		String acc_name = input.nextLine();
		System.out.println("Enter the initial amount: ");
		float balance = input.nextFloat();

		BankAccount bank1 = new BankAccount(acc_number, acc_name, balance);
		bank1.displayAccountDetails();
		System.out.println("Enter the amount to be deposited: ");
		float depamt = input.nextFloat();
		bank1.deposit(depamt);
		System.out.println("Enter the amount to be debited: ");
		float debamt = input.nextFloat();
		bank1.withdraw(debamt);
		System.out.print("Final Balance: " + bank1.balance);
	}
}

