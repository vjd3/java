package basics;

abstract class BankAccount {
    abstract void deposit();
    abstract void withdraw();
    abstract void balance();
}

class SavingsAccount extends BankAccount {
    void deposit() {
        System.out.println("Deposit to Savings Account");
    }
    void withdraw() {
        System.out.println("Withdraw from Savings Account");
    }
    void balance() {
        System.out.println("Balance in Savings Account");
    }
}

class CurrentAccount extends BankAccount {
    void deposit() {
        System.out.println("Deposit to Current Account");
    }
    void withdraw() {
        System.out.println("Withdraw from Current Account");
    }
    void balance() {
        System.out.println("Balance in Current Account");
    }
}
public class Abstracts {

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit();
        savingsAccount.withdraw();
        savingsAccount.balance();

        System.out.println("---------");
        
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.deposit();
        currentAccount.withdraw();
        currentAccount.balance();

    }
    
}
