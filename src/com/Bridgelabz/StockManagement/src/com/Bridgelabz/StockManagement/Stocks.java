package com.Bridgelabz.StockManagement;

import java.sql.SQLOutput;

public class Stocks {
    private int shareNum;
    private String stockName;
    private int shareNumber;
    private int sharePrice;

    public String getStockName(){
        return stockName;
    }

    public int getShareNum(){ return shareNum;}

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getShareNumber() {
        return shareNumber;
    }

    public void setShareNumber(int shareNumber) {
        if (shareNumber < 0.0) {
            System.out.println("Share Cannot Be Zero");
        } else {
            this.shareNumber = shareNumber;
        }
    }
    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        if(sharePrice<0.0){
            System.out.println("Share price cannot be zero.");
        } else{
            this.sharePrice = sharePrice;
        }
    }
    public void setShareNum (int shareNum) {
        if (shareNum < 0) {
            System.out.println("Share Cannot Be Zero");
        } else {
            this.shareNum = shareNum;
        }
    }
    void  calculateValue(){
        double stockValue = shareNumber*sharePrice;
        System.out.println("Value of Your Share is :- Rs."+stockValue+".");
    }
    void totalValuation(){
        int valuation = 0;
        int stockValue = 0;
        for (int i = 0; i <getShareNum(); i++){
            stockValue = shareNumber*sharePrice;
            valuation += stockValue;
        }
        System.out.println("Total Stock Valuation is "+valuation);
    }
}

