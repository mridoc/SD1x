package week2;

public class BankAccount {
    double balance;
    String Owner;
    
    //deposit
    public void deposit (double amount) {
        balance += amount;
    }
    
    public void withdraw (double amount) {
        balance -= amount;
    }

}
