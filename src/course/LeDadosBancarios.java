package course;

import java.util.Scanner;

import entities.Bank;

public class LeDadosBancarios {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		Bank bank;
		
		System.out.println("Welcome to Internet Bank!");
		
		System.out.println();
		System.out.print("Enter account number: ");
		int numberAccount = data.nextInt();
		
		System.out.print("Enter account holder: ");
		data.nextLine();
		String nameAccount = data.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = data.next().charAt(0);

		if(response == 'y') {
			System.out.print("Enter initial deposit value: $ ");
			double valueAccount = data.nextDouble();
			bank = new Bank(numberAccount, nameAccount, valueAccount);
		}else {
			bank = new Bank(numberAccount, nameAccount);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bank);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		bank.newDepositAccount(data.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(bank);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		bank.newWithdrawAccount(data.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(bank);		
		
		data.close();

	}

}
