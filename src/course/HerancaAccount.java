package course;

import entities.BusinessAccountInheritance;

public class HerancaAccount {

	public static void main(String[] args) {

		BusinessAccountInheritance account = new BusinessAccountInheritance(8010, "Bob Brown", 0.0, 500.0);

		System.out.println(account);
	}
}