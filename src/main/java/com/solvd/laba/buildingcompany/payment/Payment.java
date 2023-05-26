package com.solvd.laba.buildingcompany.payment;

public class Payment {
    private int paymentNumber;
    private String paymentDate;
    private double paymentAmount;

    public Payment(int paymentNumber, String paymentDate, double paymentAmount){
        this.paymentNumber = paymentNumber;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
    }

    public int getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(int paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
