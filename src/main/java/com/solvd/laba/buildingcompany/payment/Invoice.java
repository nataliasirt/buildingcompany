package com.solvd.laba.buildingcompany.payment;

public class Invoice {
    private int invoiceNumber;
    private String dateIssued;
    private String dueDate;
    private double amountDue;
    private double totalPriceBeforeTax;
    private double taxAmount;
    private double totalPrice;

    public Invoice(int invoiceNumber, double totalPriceBeforeTax, double taxAmount, double totalPrice){
        this.invoiceNumber = invoiceNumber;
        this.totalPriceBeforeTax = totalPriceBeforeTax;
        this.taxAmount = taxAmount;
        this.totalPrice = totalPrice;

    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(String dateIssued) {
        this.dateIssued = dateIssued;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public double getTotalPriceBeforeTax() {
        return totalPriceBeforeTax;
    }

    public void setTotalPriceBeforeTax(double totalPriceBeforeTax) {
        this.totalPriceBeforeTax = totalPriceBeforeTax;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;

    }
}
