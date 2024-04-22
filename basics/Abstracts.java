package basics;

abstract class ABCBank {
    public static void print() {
        System.out.println("Welcome to ABC Bank!");
    }
    abstract void openAccount();
    abstract void closeAccount();
}

abstract class BankAccount extends ABCBank {
    abstract void deposit();
    abstract void withdraw();
    abstract void balance();
}

class SavingsAccount extends BankAccount {
    @Override
    void openAccount() {
        System.out.println("Open Savings Account");
    } 
    @Override
    void closeAccount() {
        System.out.println("Close Savings Account");
    }
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
    @Override
    void openAccount() {
        System.out.println("Open Current Account");
    } 
    @Override
    void closeAccount() {
        System.out.println("Close Current Account");
    }
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
        ABCBank.print();
        
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.openAccount();
        savingsAccount.deposit();
        savingsAccount.withdraw();
        savingsAccount.balance();
        savingsAccount.closeAccount();

        System.out.println("---------");

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.openAccount();
        currentAccount.deposit();
        currentAccount.withdraw();
        currentAccount.balance();
        currentAccount.closeAccount();

    }
    
}
