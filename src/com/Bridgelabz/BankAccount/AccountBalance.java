package com.Bridgelabz.BankAccount;

import java.util.Scanner;

public class AccountBalance {
    Scanner keyboard = new Scanner(System.in);
    int accBalance = 10000;

    void credit() {
        System.out.println("Enter the Amount to deposit in the bank");
        System.out.println("Current Balance :- "+accBalance);
        int amtCredit = keyboard.nextInt();
        int newBalance = accBalance + amtCredit;
        System.out.println("Account Credited Successfully");
        System.out.println("Balance in the Account after deposit now is :- " + newBalance);
        accBalance = newBalance;
    }

    void debit() {
        System.out.println("Current Balance :- "+accBalance);
        System.out.println("Enter the Amount you want to debit.");
        int amtDebit = keyboard.nextInt();
        if (amtDebit < accBalance) {
            System.out.println("Debiting Amount :- " + amtDebit);
            int newBalance = accBalance - amtDebit;
            System.out.println("Account Debited Successfully");
            System.out.println("Balance in the account is :- " + newBalance);
            accBalance = newBalance;
        } else {
            System.out.println("Sorry....Debit amount exceeded account balance.");
            System.out.println(accBalance);
        }
    }
}
