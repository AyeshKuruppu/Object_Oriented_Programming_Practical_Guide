class BankAccount{

    double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public double calculateInterest(){
        return 0.0;
    }

    public double getBalance(){
        return this.balance;
    }
}

class SavingAccount extends BankAccount{

    static final double INTEREST_RATE = 10.0;

    public SavingAccount(double balance){
        super(balance);
    }

    public double calculateInterest(){
        return getBalance() * INTEREST_RATE;
    }
}

class CheckingAccount extends BankAccount{

    static final double INTEREST_RATE = 9.0;

    public CheckingAccount(double balance){
        super(balance);
    }

    public double calculateInterest(){
        return getBalance() * INTEREST_RATE;
    }
}

public class Bank {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(2000);
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.calculateInterest());

        SavingAccount savingAccount = new SavingAccount(8000);
        System.out.println(savingAccount.getBalance());
        System.out.println(savingAccount.calculateInterest());

        CheckingAccount checkingAccount = new CheckingAccount(4000);
        System.out.println(checkingAccount.getBalance());
        System.out.println(checkingAccount.calculateInterest());
    }
}
