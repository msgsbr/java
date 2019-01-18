package course;

import entities.InheritanceBusinessAccount;

public class HerancaAccount {

	public static void main(String[] args) {

		InheritanceBusinessAccount account = new InheritanceBusinessAccount(8010, "Bob Brown", 0.0, 500.0);

		System.out.println(account);
	}
}