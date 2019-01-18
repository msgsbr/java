package entities;

public class BusinessAccountInheritance extends AccountInheritance {

	private Double loanLimit;
	
	public BusinessAccountInheritance() {
		super();
	}

	public BusinessAccountInheritance(Integer number, String holder, Double balance, Double loanLimit) {
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
	
	public String toString() {
		return "Agency: " + number + "Holder: " + holder + "\nBalance: $ " + balance + "\nLoan limit: $ " + loanLimit;
	}
}