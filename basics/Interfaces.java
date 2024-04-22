package basics;

interface IABCBank {

    default void welcome() {
        System.out.println("Welcome to ABC Bank!");
    }
    void openAccount();
    void closeAccount();
}
interface IBankAccount {
    void deposit();
    void withdraw();
    void balance();
}

class SavingsAccount implements IBankAccount, IABCBank {

    @Override
    public void openAccount() {
        System.out.println("Open Savings Account");
    }
    @Override
    public void closeAccount() {
        System.out.println("Close Savings Account");
    }
    @Override
    public void deposit() {
        System.out.println("Deposit to Savings Account");
    }
    @Override
    public void withdraw() {
        System.out.println("Withdraw from Savings Account");
    }
    @Override
    public void balance() {
        System.out.println("Balance in Savings Account");
    }
}
public class Interfaces {

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        savings.welcome();
        savings.openAccount();
        savings.deposit();
        savings.withdraw();
        savings.balance();
        savings.closeAccount();
    }
    
}
