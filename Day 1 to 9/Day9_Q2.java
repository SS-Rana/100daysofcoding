class Bank {
    String name;
    int accountNo;
    int balance;

    Bank(String name, int accountNo , int balance){
        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;
    }
    public void printDetail(){
        System.out.println("Name : "+this.name);
        System.out.println("Account number : "+this.accountNo);
        System.out.println("Balance : "+this.balance);
    }
}
public class Day9_Q2 {
    public static void main(String[] args) {
        Bank n1 = new Bank("Sumit", 467414987, 5445);
        n1.printDetail();
    }
}


