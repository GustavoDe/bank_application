package application;
import java.util.Scanner;

import entities.Account;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Cria a conta;
        System.out.print("Enter account number: ");
        int numberAccount = sc.nextInt();
        Account account;

        System.out.println();

        System.out.print("Enter account holder: ");
        String holderAccont = sc.next();

        System.out.println();

        System.out.print("Is there na initial deposit: ");
        boolean initialDeposit = sc.nextBoolean();
        //verifica se o usuário quer fazer um depósito inicial
        if (initialDeposit == true) {
            System.out.print("Enter initial deposit value: ");
            double amount = sc.nextDouble();
             account = new Account(holderAccont, numberAccount, amount);
            System.out.println(account);
        } else {
             account = new Account(holderAccont, numberAccount);
            System.out.println(account);
        }

        //faz depósito
        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println(account);

        //faz saque

        System.out.print("Enter a withdraw value: ");
        double valueWithdraw = sc.nextDouble();
        account.withdraw(valueWithdraw);
        System.out.println(account);

        sc.close();
    }
}
