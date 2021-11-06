package Exercise1;

import java.util.Scanner;

public class Bank {
    private double balance, rate;
    Scanner sc = new Scanner(System.in);

    public Bank() {
        super();
    }

    public Bank(double balance, double rate) {
        super();
        this.balance = balance;
        this.rate = rate;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return this.rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void inputToCalc() {
        System.out.println("------Enter to calculate interest-------");
        System.out.println("Enter loan amount: ");
        this.balance = sc.nextDouble();
        System.out.println("Enter interest rate: ");
        this.rate = sc.nextDouble();
    }

    public double calculateInterest() {
        return this.balance * (this.rate / 1200);
    }

    public void showMonthlyInterest() {
        System.out.println("This loan has a monthly interest rate of $" + this.calculateInterest());
    }
}
