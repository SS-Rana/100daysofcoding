package Bank;
import java.util.ArrayList;
public class Main {
	
	public static void main (String args[]) {
		Bank bank = new Bank();
		
		Account account1 = new Account("person1", 56789.09, 123456789);
		Account account2 = new Account("person2", 45263.24, 321456987);
		Account account3 = new Account("person3", 78956.23, 453698465);
		
		bank.addAccount(account1);
		bank.addAccount(account2);
		bank.addAccount(account3);
		
		ArrayList <Account> accounts = bank.getAccounts();
		
		for(Account account : accounts) {
			System.out.println(account.getAccountInfo());
		}
		
		System.out.println("\nDepositing 4500 into account of person1");
		bank.deposite(account1, 4500);
		
		System.out.println("Removing 4500 from account of person2");
		bank.widthraw(account2, 4500);
		
		System.out.println("Deleting a account of person3 from bank\n");
		bank.deleteAccount(account3);
		
		for(Account account : accounts) {
			System.out.println(account.getAccountInfo());
		}
		
	}
}
