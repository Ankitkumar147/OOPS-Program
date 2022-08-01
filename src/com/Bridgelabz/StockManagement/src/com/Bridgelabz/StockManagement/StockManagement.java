package com.Bridgelabz.StockManagement;

import java.util.Scanner;

public class StockManagement {

    public static void main(String[] args) {
        int valuePerShare, valuation = 0;
        Scanner sc1 = new Scanner(System.in);
        Stocks newShare = new Stocks();
        System.out.println("Welcome to the StockManagement Program.");
        System.out.println("Enter the Number of Shares you want to add.");
        int shareNum = sc1.nextInt();
        for (int i = 0; i < shareNum; i++){
            System.out.println("Enter Share Name:- ");
            newShare.setStockName(sc1.next());
            System.out.println("Enter share price");
            newShare.setSharePrice(sc1.nextInt());
            System.out.println("Enter the Number of Shares");
            newShare.setShareNumber(sc1.nextInt());
            //newShare.calculateValue();
            //newShare.totalValuation();
            valuePerShare = shareNum*newShare.getSharePrice();
            valuation = valuePerShare+valuation;
        }
        sc1.close();
        return valuation;
    }
}
