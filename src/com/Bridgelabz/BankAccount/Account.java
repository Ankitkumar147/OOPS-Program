package com.Bridgelabz.BankAccount;

import java.util.Scanner;

public class Account {

    public static void main(String[] args) {

        AccountBalance option = new AccountBalance();
        System.out.println("Enter the choice:---");
        System.out.println("1.Debit.");
        System.out.println("2.Credit.");
        System.out.println("3.Account Balance.");
        Scanner sc1 = new Scanner(System.in);
        int choice = sc1.nextInt();
        switch (choice) {
            case (1):
                option.debit();
                break;
            case (2):
                option.credit();
                break;
            case(3):
                System.out.println(option.accBalance);
        }
    }
}
