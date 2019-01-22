package entities;

public class InheritanceAbstractBusinessAccount extends InheritanceAbstractAccount {

	private Double loanLimit;
	
	public InheritanceAbstractBusinessAccount() {
		super();
	}

	public InheritanceAbstractBusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			//deposit(amount);
			balance += amount - 10.0;
			
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
	public String toString() {
		return "Agency: " + getNumber() + "\nHolder: " + getHolder() + "\nBalance: $ " + balance + "\nLoan limit: $ " + loanLimit;
	}
}