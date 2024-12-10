package BankAPP;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountHolder, double balance, int accountNumber, double overdraftLimit) {
        super(accountHolder, balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance() + overdraftLimit) {
            System.out.println("Withdrawal is not possible! The amount exceeds the credit limit.");
        } else {
            double newBalance = getBalance() - amount;
            setBalance(newBalance);
            System.out.println(amount + " Dollar was withdrawn. New balance: " + getBalance());
        }
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Credit Limit: " + overdraftLimit);
    }
}

