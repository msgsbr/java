package course;

import entities.InheritanceAccount;
import entities.InheritanceBusinessAccount;
import entities.InheritanceSavingsAccount;

public class UpcastingDowncasting {

	public static void main(String[] args) {

		InheritanceAccount acc = new InheritanceAccount(1001, "Alex", 0.0);
		InheritanceBusinessAccount bacc = new InheritanceBusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING		
		InheritanceAccount acc1 = bacc;
		InheritanceAccount acc2 = new InheritanceBusinessAccount(1003, "Bob", 0.0, 200.0);
		InheritanceAccount acc3 = new InheritanceSavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING	
		InheritanceBusinessAccount acc4 = (InheritanceBusinessAccount) acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3; ( ERROR )
		if (acc3 instanceof InheritanceBusinessAccount) {
			InheritanceBusinessAccount acc5 = (InheritanceBusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof InheritanceSavingsAccount) {
			InheritanceSavingsAccount acc5 = (InheritanceSavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}