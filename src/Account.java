
public class Account {
	
	private int accountNumber;
	private String name;
	private double balance;
	
	
	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	
	public Account() {
		this.accountNumber = 8;
		this.name = "Sachin";
		this.balance = 0124.863;
	}



	public int getAccountNumber() {
		return accountNumber;
	}


	public String getName() {
		return name;
	}


	public double getBalance() {
		return balance;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void combine(TransactionRecord transaction) {
		if (this.accountNumber == transaction.getAccountNumber()) {
			this.balance = this.balance + transaction.getAmount();
		}
		
		else {
			this.balance = balance;
			System.out.println("No transaction found!");
		}
		
	}
	
	
	

}
