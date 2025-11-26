
public class TransactionRecord {

	private int accountNumber;
	private double amount;
	
	
	public TransactionRecord(int accountNumber, double amount) {
		this.accountNumber = accountNumber;
		this.amount = amount;
	}
	
	public TransactionRecord() {
		this.accountNumber = 123;
		this.amount = 234.234;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public double getAmount() {
		return amount;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
	
}
