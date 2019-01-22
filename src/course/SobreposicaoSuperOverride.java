package course;

import entities.InheritanceAccount;
import entities.InheritanceBusinessAccount;
import entities.InheritanceSavingsAccount;

public class SobreposicaoSuperOverride {

	public static void main(String[] args) {

		InheritanceAccount acc1 = new InheritanceAccount(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		// UPCASTING "InheritanceSavingsAccount" to "InheritanceAccount"
		InheritanceAccount acc2 = new InheritanceSavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		// UPCASTING "InheritanceBusinessAccount" to "InheritanceAccount"
		InheritanceAccount acc3 = new InheritanceBusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}
	
}