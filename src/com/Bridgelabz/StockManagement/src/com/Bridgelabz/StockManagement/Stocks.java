package com.Bridgelabz.StockManagement;

import java.sql.SQLOutput;

public class Stocks {
    private String stockName;
    private double shareNumber;
    private double sharePrice;

    public String getStockName(){
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getShareNumber() {
        return shareNumber;
    }

    public void setShareNumber(double shareNumber) {
        if (shareNumber < 0.0) {
            System.out.println("Share Cannot Be Zero");
        } else {
            this.shareNumber = shareNumber;
        }
    }
    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        if(sharePrice<0.0){
            System.out.println("Share price cannot be zero.");
        } else{
            this.sharePrice = sharePrice;
        }
    }
    void CalculateValue(){
        double stockValue = shareNumber*sharePrice;
        System.out.println("Total Value of Your Share is :- Rs."+stockValue+".");
        }
    }
