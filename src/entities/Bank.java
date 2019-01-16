package entities;

public class Bank {

	private int numberAccount;
	private String nameAccount;
	private double valueAccount;
	
	public Bank(int numberAccount, String nameAccount) {
		this.numberAccount = numberAccount;
		this.nameAccount = nameAccount;
	}

	public Bank(int numberAccount, String nameAccount, double initialValueAccount) {
		this.numberAccount = numberAccount;
		this.nameAccount = nameAccount;
		newDepositAccount(initialValueAccount);
	}
	
	public int getNumberAccount() {
		return numberAccount;
	}

	public String getNameAccount() {
		return nameAccount;
	}

	public void setNameAccount(String nameAccount) {
		this.nameAccount = nameAccount;
	}

	public double getValueAccount() {
		return valueAccount;
	}
	
	public void newDepositAccount(double valueAccount) {
		this.valueAccount += valueAccount;
	}
	
	public void newWithdrawAccount(double valueAccount) {
		this.valueAccount -= valueAccount + 5.00; 
	}
	
	public String toString() {
		return 	"Account " 
				+ getNumberAccount() 
				+ ", Holder: "
				+ getNameAccount()
				+ ", Balance: $ "
				+ String.format("%.2f", getValueAccount());
	}
	
}
