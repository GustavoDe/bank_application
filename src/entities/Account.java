package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;
    final double WITHDRAWAL_TAX = 5.00;

    public Account(String holder, int number) {
        this.holder = holder;
        this.number = number;
    }

    public Account(String holder, int number, double initial_balance) {
        this.holder = holder;
        this.number = number;
        deposit(initial_balance);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + WITHDRAWAL_TAX;
    }

    public String toString() {
        return "Account data:"
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }

}
