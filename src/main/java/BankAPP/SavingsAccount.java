package BankAPP;

public class SavingsAccount extends BankAccount {

    private double monthlyInterestRate;
    private int withdrawalLimit;
    private int withdrawalsMade;

    public SavingsAccount(String accountHolder, double balance, int accountNumber, double monthlyInterestRate) {
        super(accountHolder, balance, accountNumber);
        this.monthlyInterestRate = monthlyInterestRate;
        this.withdrawalLimit = 3;
        this.withdrawalsMade = 0;
    }

    public void applyInterest() {
        double interest = getBalance() * (monthlyInterestRate / 100);
        deposit(interest);
        System.out.println("Interest added: " + interest + ". New Balans: " + getBalance());
    }


    @Override
    public void withdraw(double amount) {
        if (withdrawalsMade >= withdrawalLimit) {
            System.out.println("Withdrawal limit reached! You cannot make any more withdrawals for this month.");
        } else if (amount > getBalance()) {
            System.out.println("The balance is not enough! The current balance : " + getBalance());
        } else {
            super.withdraw(amount);
            withdrawalsMade++;
            System.out.println("Remaining withdrawal right: " + (withdrawalLimit - withdrawalsMade));
        }
    }

    @Override
    public void displayinfo() {
        super.displayinfo(); // Əsas sinifin məlumatını göstər
        System.out.println("Monthly Interest Rate: " + monthlyInterestRate + "%");
        System.out.println("Remaining Withdrawal Right: " + (withdrawalLimit - withdrawalsMade));
    }

}
