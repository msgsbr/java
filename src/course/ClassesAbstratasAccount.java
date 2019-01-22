package course;

import java.util.ArrayList;
import java.util.List;

import entities.InheritanceAbstractAccount;
import entities.InheritanceAbstractBusinessAccount;
import entities.InheritanceAbstractSavingsAccount;

public class ClassesAbstratasAccount {

	public static void main(String[] args) {

		List<InheritanceAbstractAccount> list = new ArrayList<>();
		
		list.add(new InheritanceAbstractSavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new InheritanceAbstractBusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new InheritanceAbstractSavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new InheritanceAbstractBusinessAccount(1005, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		for (InheritanceAbstractAccount acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (InheritanceAbstractAccount acc : list) {
			acc.deposit(10.0);
		}
		for (InheritanceAbstractAccount acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}
}