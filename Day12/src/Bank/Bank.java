package Bank;
import java.util.ArrayList;
public class Bank {
	private ArrayList<Account> accounts;
	Bank(){
		accounts = new ArrayList<Account>();
	}
	
	public void addAccount(Account account) {
		accounts.add(account);
	}
	public void deleteAccount(Account account) {
		accounts.remove(account);
	}
	public void deposite(Account account, double amount) {
		account.addMoney(amount);
	}
	public void widthraw(Account account, double amount) {
		account.removeMoney(amount);
	}
	
	public ArrayList <Account> getAccounts(){
		return accounts;
	}
}

