package Bank;

public class Account {
	private String name;
	private double balance;
	private int accountNo;
	
	Account(String name, double balance , int accountNo){
		this.name = name;
		this.balance = balance;
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public int getPassword() {
		return accountNo;
	}
	public void setPassword(int accountNo) {
		this.accountNo = accountNo;
	}
	public void addMoney(double amount) {
		balance += amount;
	}
	
	public void removeMoney(double amount) {
		balance -= amount;
	}
	public String getAccountInfo() {
        return "Name: " + name + ", Account Number: " + accountNo + ", Balance: " + balance;
    }
}
