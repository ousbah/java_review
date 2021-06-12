package polymorphism.heterogeneous_collection;

public class BankAccount extends Asset {
	
	private String bankName;
	private int accountNumber;
	private float balance;
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public void printDescription() {
		super.printDescription();
		System.out.println("Name: " + bankName);
		System.out.printf("Account #: %d%n", accountNumber);
		System.out.printf("Current balance: $%.02f%n", balance);
	}
	
	public float getNetWorth() {
		return balance;
	}
}
